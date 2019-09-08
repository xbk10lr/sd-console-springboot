package sd.console.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sd.console.dto.generate.BatchStepExecutionSeq;
import sd.console.dto.generate.BatchStepExecutionSeqExample;

public interface BatchStepExecutionSeqMapper {
    int countByExample(BatchStepExecutionSeqExample example);

    int deleteByExample(BatchStepExecutionSeqExample example);

    int insert(BatchStepExecutionSeq record);

    int insertSelective(BatchStepExecutionSeq record);

    List<BatchStepExecutionSeq> selectByExample(BatchStepExecutionSeqExample example);

    int updateByExampleSelective(@Param("record") BatchStepExecutionSeq record, @Param("example") BatchStepExecutionSeqExample example);

    int updateByExample(@Param("record") BatchStepExecutionSeq record, @Param("example") BatchStepExecutionSeqExample example);
}