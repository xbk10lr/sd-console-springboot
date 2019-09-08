package sd.console.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sd.console.dto.generate.BatchJobSeq;
import sd.console.dto.generate.BatchJobSeqExample;

public interface BatchJobSeqMapper {
    int countByExample(BatchJobSeqExample example);

    int deleteByExample(BatchJobSeqExample example);

    int insert(BatchJobSeq record);

    int insertSelective(BatchJobSeq record);

    List<BatchJobSeq> selectByExample(BatchJobSeqExample example);

    int updateByExampleSelective(@Param("record") BatchJobSeq record, @Param("example") BatchJobSeqExample example);

    int updateByExample(@Param("record") BatchJobSeq record, @Param("example") BatchJobSeqExample example);
}