package sd.console.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sd.console.dto.generate.BatchJobExecutionSeq;
import sd.console.dto.generate.BatchJobExecutionSeqExample;

public interface BatchJobExecutionSeqMapper {
    int countByExample(BatchJobExecutionSeqExample example);

    int deleteByExample(BatchJobExecutionSeqExample example);

    int insert(BatchJobExecutionSeq record);

    int insertSelective(BatchJobExecutionSeq record);

    List<BatchJobExecutionSeq> selectByExample(BatchJobExecutionSeqExample example);

    int updateByExampleSelective(@Param("record") BatchJobExecutionSeq record, @Param("example") BatchJobExecutionSeqExample example);

    int updateByExample(@Param("record") BatchJobExecutionSeq record, @Param("example") BatchJobExecutionSeqExample example);
}