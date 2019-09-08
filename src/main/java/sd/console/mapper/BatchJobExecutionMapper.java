package sd.console.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sd.console.dto.generate.BatchJobExecution;
import sd.console.dto.generate.BatchJobExecutionExample;

public interface BatchJobExecutionMapper {
    int countByExample(BatchJobExecutionExample example);

    int deleteByExample(BatchJobExecutionExample example);

    int deleteByPrimaryKey(Long jobExecutionId);

    int insert(BatchJobExecution record);

    int insertSelective(BatchJobExecution record);

    List<BatchJobExecution> selectByExample(BatchJobExecutionExample example);

    BatchJobExecution selectByPrimaryKey(Long jobExecutionId);

    int updateByExampleSelective(@Param("record") BatchJobExecution record, @Param("example") BatchJobExecutionExample example);

    int updateByExample(@Param("record") BatchJobExecution record, @Param("example") BatchJobExecutionExample example);

    int updateByPrimaryKeySelective(BatchJobExecution record);

    int updateByPrimaryKey(BatchJobExecution record);
}