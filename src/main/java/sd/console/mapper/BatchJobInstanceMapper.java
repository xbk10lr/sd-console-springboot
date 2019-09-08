package sd.console.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sd.console.dto.generate.BatchJobInstance;
import sd.console.dto.generate.BatchJobInstanceExample;

public interface BatchJobInstanceMapper {
    int countByExample(BatchJobInstanceExample example);

    int deleteByExample(BatchJobInstanceExample example);

    int deleteByPrimaryKey(Long jobInstanceId);

    int insert(BatchJobInstance record);

    int insertSelective(BatchJobInstance record);

    List<BatchJobInstance> selectByExample(BatchJobInstanceExample example);

    BatchJobInstance selectByPrimaryKey(Long jobInstanceId);

    int updateByExampleSelective(@Param("record") BatchJobInstance record, @Param("example") BatchJobInstanceExample example);

    int updateByExample(@Param("record") BatchJobInstance record, @Param("example") BatchJobInstanceExample example);

    int updateByPrimaryKeySelective(BatchJobInstance record);

    int updateByPrimaryKey(BatchJobInstance record);
}