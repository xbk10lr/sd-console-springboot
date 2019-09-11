package sd.console.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONArray;
import sd.console.dto.common.BatchJobRunStatus;
import sd.console.dto.generate.BatchStepExecution;
import sd.console.dto.generate.JobTaskInfo;
import sd.console.service.JobService;

@Slf4j
@RestController
@RequestMapping("/jobs")
public class JobController {

	@Autowired
	JobService jobService;
	
	@RequestMapping("/getAllJobs")
	public String getAllJobs(Integer page,Integer rows){
		log.info("getAllJobs");
		if(null==page){
			page=1;
		}
		if(null==rows){
			rows=2;
		}
//        PageHelper.startPage(page -1, rows);//设置数据库分页查询的范围
		List<JobTaskInfo> allJobs = jobService.getAllJobs(page, rows);
        PageInfo<JobTaskInfo> pageInfo=new PageInfo<>(allJobs);
		Map<String,Object> m=new HashMap<String,Object>();
		m.put("total", pageInfo.getTotal());
		m.put("rows", allJobs);
		JSONArray js=JSONArray.fromObject(m);
		String res = js.toString();
		log.info(js.toString());
		return res.substring(1, res.length()-1);
	}
	
	@RequestMapping("/searchJob")
	public String searchJob(String taskName,String taskId,Integer page,Integer rows){
		log.info("taskName:"+taskName+",taskId:"+taskId+",page:"+page+",rows:"+rows);
		JobTaskInfo jobTaskInfo = new JobTaskInfo();
		jobTaskInfo.setId(taskId==null || taskId.trim()==""?null:Integer.valueOf(taskId));
		jobTaskInfo.setTaskName(taskName==null || taskName.trim()==""?null:taskName);
        PageHelper.startPage(page, rows);//设置数据库分页查询的范围
		List<JobTaskInfo> allJobs = jobService.searchJobByPage(jobTaskInfo,page,rows);
        PageInfo<JobTaskInfo> pageInfo=new PageInfo<>(allJobs);
		Map<String,Object> m=new HashMap<String,Object>();
		m.put("total", pageInfo.getTotal());
		m.put("rows", allJobs);
		JSONArray js=JSONArray.fromObject(m);
		String res = js.toString();
		log.info(js.toString());
		return res.substring(1, res.length()-1);
	}
	
	@RequestMapping("/addJob")
	public String addJob(JobTaskInfo jobTaskInfo){
		log.info("add job:"+jobTaskInfo.toString());
		try{
			jobService.addJob(jobTaskInfo);
		} catch(Exception e){
			log.error(e.getMessage(),e);
			return "false";
		}
		return "true";
	}
	
	@RequestMapping("/updateJob")
	public String updateJob(JobTaskInfo jobTaskInfo){
		log.info("update job:"+jobTaskInfo.toString());
		try{
			jobService.updateJob(jobTaskInfo);
		} catch(Exception e){
			log.error(e.getMessage(),e);
			return "false";
		}
		return "true";
	}
	
	@RequestMapping("/delJob")
    public Boolean delJob(Integer id){
		log.info(id.toString());
    	return jobService.delJob(id);
    }
	
	@RequestMapping("/getJobRunStatus")
    public String getJobRunStatus(String taskName,Long jobInstanceId, Date startDate,Date endDate,Integer page,Integer rows){
		log.info("taskName:"+taskName+",jobInstanceId:"+jobInstanceId+",startDate:"+startDate+",endDate:"+endDate);
		PageHelper.startPage(page, rows);//设置数据库分页查询的范围
		if(taskName==""){
			taskName=null;
		}
    	List<BatchJobRunStatus> allJobStatus = jobService.getJobRunStatus(taskName,jobInstanceId, startDate, endDate, page, rows);
    	PageInfo<BatchJobRunStatus> pageInfo=new PageInfo<>(allJobStatus);
		Map<String,Object> m=new HashMap<String,Object>();
		m.put("total", pageInfo.getTotal());
		m.put("rows", allJobStatus);
		JSONArray js=JSONArray.fromObject(m);
		String res = js.toString();
		log.info(res);
    	return res.substring(1, res.length()-1);
    }
	
	@RequestMapping("/getStepRunStatus")
    public String getStepRunStatus(Long jobExecutionId,Integer page,Integer rows){
		log.info("jobExecutionId:"+jobExecutionId);
		PageHelper.startPage(page, rows);//设置数据库分页查询的范围
    	List<BatchStepExecution> allJobStatus = jobService.getStepRunStatus(jobExecutionId, page, rows);
    	PageInfo<BatchStepExecution> pageInfo=new PageInfo<>(allJobStatus);
		Map<String,Object> m=new HashMap<String,Object>();
		m.put("total", pageInfo.getTotal());
		m.put("rows", allJobStatus);
		JSONArray js=JSONArray.fromObject(m);
		String res = js.toString();
		log.info(res);
    	return res.substring(1, res.length()-1);
    }
}
