package sd.console.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import sd.console.dto.common.BatchJobRunStatus;
import sd.console.dto.generate.BatchStepExecution;
import sd.console.dto.generate.BatchStepExecutionExample;
import sd.console.dto.generate.JobTaskInfo;
import sd.console.dto.generate.JobTaskInfoExample;
import sd.console.mapper.BatchStepExecutionMapper;
import sd.console.mapper.JobTaskInfoMapper;
import sd.console.mapper.extend.BatchJobExecutionExtendMapper;
import sd.console.mapper.extend.JobTaskInfoExtendMapper;
import sd.console.util.DateUtil;

@Slf4j
@Service
public class JobServiceImpl implements JobService {

	static final String url="http://localhost:8080/jobs/";
	
	@Autowired
	JobTaskInfoMapper jobTaskInfoMapper;
	
	@Autowired
	JobTaskInfoExtendMapper jobTaskInfoExtendMapper;
	
	@Autowired
	BatchJobExecutionExtendMapper batchJobExecutionExtendMapper;
	
	@Autowired
	BatchStepExecutionMapper batchStepExecutionMapper;
	
	@Autowired
	HttpService httpService;
	
	@Override
	public List<JobTaskInfo> getAllJobs(Integer page,Integer limit) {
		log.info("service");
//		JobTaskInfoExample example = new JobTaskInfoExample();
//		List<JobTaskInfo> jobs = jobTaskInfoMapper.selectByExample(example);
		List<JobTaskInfo> jobs = jobTaskInfoExtendMapper.queryJobByPage(page, limit);
		log.info(jobs.toString());
		log.info("mapper success");
		return jobs;
	}

	@Override
	public List<JobTaskInfo> searchJob(JobTaskInfo jobTaskInfo) {
		JobTaskInfoExample example = new JobTaskInfoExample();
		if(jobTaskInfo.getId() != null){
			example.createCriteria().andIdEqualTo(jobTaskInfo.getId());
		}
		if(jobTaskInfo.getTaskName() != null){
			example.createCriteria().andTaskNameEqualTo(jobTaskInfo.getTaskName());
		}
		List<JobTaskInfo> jobs = jobTaskInfoMapper.selectByExample(example);
		return jobs;
	}

	@Override
	public void addJob(JobTaskInfo jobTaskInfo) throws Exception {
		//如果任务状态为开启，则需要在定时任务中注册
		if("0".equals(jobTaskInfo.getTaskStatus())){
			Map<String,String> map = new HashMap<>();
			map.put("expression", jobTaskInfo.getTaskExpress());
			map.put("jobName", jobTaskInfo.getTaskName());
			if(!httpService.send(url+"create", map)){
				throw new Exception("通信失败");
			}
		}
		jobTaskInfoMapper.insertSelective(jobTaskInfo);
		
	}

	@Override
	public Boolean delJob(Integer id) {
		//首先在定时任务中去掉该定时任务
		JobTaskInfo jobTaskInfo = jobTaskInfoMapper.selectByPrimaryKey(id);
		Map<String,String> map = new HashMap<>();
		map.put("jobName", jobTaskInfo.getTaskName());
		if(httpService.send(url+"stop", map)){
			jobTaskInfoMapper.deleteByPrimaryKey(id);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void updateJob(JobTaskInfo jobTaskInfo) throws Exception {
		//如果任务状态被更新为关闭，则停止定时运行该任务
		if("1".equals(jobTaskInfo.getTaskStatus())){
			Map<String,String> map = new HashMap<>();
			map.put("jobName", jobTaskInfo.getTaskName());
			if(httpService.send(url+"stop", map)){
				jobTaskInfoMapper.updateByPrimaryKeySelective(jobTaskInfo);		
			} else {
				throw new Exception("通信失败");
			}
		} else{
			Map<String,String> map = new HashMap<>();
			map.put("expression", jobTaskInfo.getTaskExpress());
			map.put("jobName", jobTaskInfo.getTaskName());
			if(httpService.send(url+"create", map)){
				jobTaskInfoMapper.updateByPrimaryKeySelective(jobTaskInfo);		
			} else {
				throw new Exception("通信失败");
			}
		}
	}

	@Override
	public int getNums() {
		JobTaskInfoExample example = new JobTaskInfoExample();
		int countByExample = jobTaskInfoMapper.countByExample(example);
		return countByExample;
	}

	@Override
	public List<JobTaskInfo> searchJobByPage(JobTaskInfo jobTaskInfo, Integer page, Integer limit) {
		JobTaskInfoExample example = new JobTaskInfoExample();
		if(jobTaskInfo.getId() != null){
			example.createCriteria().andIdEqualTo(jobTaskInfo.getId());
		}
		if(jobTaskInfo.getTaskName() != null){
			example.createCriteria().andTaskNameEqualTo(jobTaskInfo.getTaskName());
		}
		List<JobTaskInfo> jobs = jobTaskInfoMapper.selectByExample(example);
		return jobs;
	}
	
	@Override
	public int getNumsByExample(JobTaskInfoExample example) {
		int countByExample = jobTaskInfoMapper.countByExample(example);
		return countByExample;
	}

	@Override
	public List<BatchJobRunStatus> getJobRunStatus(String jobName, Long jobInstanceId, Date startDate,Date endDate,Integer page, Integer limit) {
		if(endDate!=null){
			endDate = DateUtil.addDate(endDate, 0, 0, 1, 0, 0, 0, 0);
			log.info(endDate.toString());
		}
		return batchJobExecutionExtendMapper.getJobRunStatus(jobName, jobInstanceId, startDate, endDate);
	}

	@Override
	public List<BatchStepExecution> getStepRunStatus(Long jobExecutionId, Integer page, Integer limit) {
		BatchStepExecutionExample example = new BatchStepExecutionExample();
		example.createCriteria().andJobExecutionIdEqualTo(jobExecutionId);
		return batchStepExecutionMapper.selectByExample(example);
	}

}
