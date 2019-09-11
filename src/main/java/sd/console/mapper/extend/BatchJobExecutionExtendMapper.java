package sd.console.mapper.extend;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import sd.console.dto.common.BatchJobRunStatus;

public interface BatchJobExecutionExtendMapper {
	
	public List<BatchJobRunStatus> getJobRunStatus(@Param("jobName")String jobName,@Param("jobInstanceId")Long jobInstanceId,@Param("startDate")Date startDate,@Param("endDate")Date endDate);
}