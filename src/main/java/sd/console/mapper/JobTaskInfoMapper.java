package sd.console.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sd.console.dto.generate.JobTaskInfo;
import sd.console.dto.generate.JobTaskInfoExample;

public interface JobTaskInfoMapper {
    int countByExample(JobTaskInfoExample example);

    int deleteByExample(JobTaskInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobTaskInfo record);

    int insertSelective(JobTaskInfo record);

    List<JobTaskInfo> selectByExample(JobTaskInfoExample example);

    JobTaskInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobTaskInfo record, @Param("example") JobTaskInfoExample example);

    int updateByExample(@Param("record") JobTaskInfo record, @Param("example") JobTaskInfoExample example);

    int updateByPrimaryKeySelective(JobTaskInfo record);

    int updateByPrimaryKey(JobTaskInfo record);
}