package sd.console.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sd.console.dto.generate.BatchJobExecutionParams;
import sd.console.dto.generate.BatchJobExecutionParamsExample;

public interface BatchJobExecutionParamsMapper {
    int countByExample(BatchJobExecutionParamsExample example);

    int deleteByExample(BatchJobExecutionParamsExample example);

    int insert(BatchJobExecutionParams record);

    int insertSelective(BatchJobExecutionParams record);

    List<BatchJobExecutionParams> selectByExample(BatchJobExecutionParamsExample example);

    int updateByExampleSelective(@Param("record") BatchJobExecutionParams record, @Param("example") BatchJobExecutionParamsExample example);

    int updateByExample(@Param("record") BatchJobExecutionParams record, @Param("example") BatchJobExecutionParamsExample example);
}