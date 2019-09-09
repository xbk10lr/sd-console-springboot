package sd.console.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import sd.console.dto.generate.JobTaskInfo;
import sd.console.dto.generate.JobTaskInfoExample;
import sd.console.mapper.JobTaskInfoMapper;
import sd.console.mapper.extend.JobTaskInfoExtendMapper;

@Slf4j
@Service
public class JobServiceImpl implements JobService {

	@Autowired
	JobTaskInfoMapper jobTaskInfoMapper;
	
	@Autowired
	JobTaskInfoExtendMapper jobTaskInfoExtendMapper;
	
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
	public void addJob(JobTaskInfo jobTaskInfo) {
		jobTaskInfoMapper.insertSelective(jobTaskInfo);
	}

	@Override
	public void delJob(Integer id) {
		jobTaskInfoMapper.deleteByPrimaryKey(id);		
	}

	@Override
	public void updateJob(JobTaskInfo jobTaskInfo) {
		jobTaskInfoMapper.updateByPrimaryKeySelective(jobTaskInfo);		
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

}
