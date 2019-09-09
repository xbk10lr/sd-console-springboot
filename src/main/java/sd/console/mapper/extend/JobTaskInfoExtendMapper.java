package sd.console.mapper.extend;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import sd.console.dto.generate.JobTaskInfo;

public interface JobTaskInfoExtendMapper {
	
	@Select("select ID AS id,TASK_NAME AS taskName,TASK_EXPRESS AS taskExpress,TASK_PARAM AS taskParam,SYS_ID AS sysId,TASK_STATUS AS taskStatus from JOB_TASK_INFO")
	public List<JobTaskInfo> queryJobByPage(@Param("pageNum")int startIndex, @Param("pageSize")int pageNumIn);
	
}