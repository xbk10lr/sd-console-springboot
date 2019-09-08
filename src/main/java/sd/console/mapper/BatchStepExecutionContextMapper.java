package sd.console.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sd.console.dto.generate.BatchStepExecutionContext;
import sd.console.dto.generate.BatchStepExecutionContextExample;

public interface BatchStepExecutionContextMapper {
    int countByExample(BatchStepExecutionContextExample example);

    int deleteByExample(BatchStepExecutionContextExample example);

    int deleteByPrimaryKey(Long stepExecutionId);

    int insert(BatchStepExecutionContext record);

    int insertSelective(BatchStepExecutionContext record);

    List<BatchStepExecutionContext> selectByExampleWithBLOBs(BatchStepExecutionContextExample example);

    List<BatchStepExecutionContext> selectByExample(BatchStepExecutionContextExample example);

    BatchStepExecutionContext selectByPrimaryKey(Long stepExecutionId);

    int updateByExampleSelective(@Param("record") BatchStepExecutionContext record, @Param("example") BatchStepExecutionContextExample example);

    int updateByExampleWithBLOBs(@Param("record") BatchStepExecutionContext record, @Param("example") BatchStepExecutionContextExample example);

    int updateByExample(@Param("record") BatchStepExecutionContext record, @Param("example") BatchStepExecutionContextExample example);

    int updateByPrimaryKeySelective(BatchStepExecutionContext record);

    int updateByPrimaryKeyWithBLOBs(BatchStepExecutionContext record);

    int updateByPrimaryKey(BatchStepExecutionContext record);
}