package sd.console.service;

import java.util.List;

import sd.console.dto.generate.JobTaskInfo;
import sd.console.dto.generate.JobTaskInfoExample;

public interface JobService {

	public List<JobTaskInfo> getAllJobs(Integer page,Integer limit);
	
	public List<JobTaskInfo> searchJob(JobTaskInfo jobTaskInfo);
	
	public List<JobTaskInfo> searchJobByPage(JobTaskInfo jobTaskInfo,Integer page,Integer limit);
	
	public void addJob(JobTaskInfo jobTaskInfo);
	
	public void delJob(Integer id);
	
	public void updateJob(JobTaskInfo jobTaskInfo);
	
	public int getNums();

	int getNumsByExample(JobTaskInfoExample example);
}
