package sd.console.service;

import java.util.Date;
import java.util.List;

import sd.console.dto.common.BatchJobRunStatus;
import sd.console.dto.generate.BatchStepExecution;
import sd.console.dto.generate.JobTaskInfo;
import sd.console.dto.generate.JobTaskInfoExample;

public interface JobService {

	public List<JobTaskInfo> getAllJobs(Integer page,Integer limit);
	
	public List<JobTaskInfo> searchJob(JobTaskInfo jobTaskInfo);
	
	public List<JobTaskInfo> searchJobByPage(JobTaskInfo jobTaskInfo,Integer page,Integer limit);
	
	public void addJob(JobTaskInfo jobTaskInfo) throws Exception;
	
	public Boolean delJob(Integer id);
	
	public void updateJob(JobTaskInfo jobTaskInfo) throws Exception;
	
	public int getNums();

	int getNumsByExample(JobTaskInfoExample example);
	
	List<BatchJobRunStatus> getJobRunStatus(String jobName,Long jobInstanceId, Date startDate,Date endDate,Integer page,Integer limit);
	
	List<BatchStepExecution> getStepRunStatus(Long jobExecutionId,Integer page,Integer limit);
}
