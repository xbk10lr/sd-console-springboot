package sd.console.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sd.console.dto.generate.CheckError;
import sd.console.dto.generate.CheckErrorExample;

public interface CheckErrorMapper {
    int countByExample(CheckErrorExample example);

    int deleteByExample(CheckErrorExample example);

    int deleteByPrimaryKey(String errorNbr);

    int insert(CheckError record);

    int insertSelective(CheckError record);

    List<CheckError> selectByExample(CheckErrorExample example);

    CheckError selectByPrimaryKey(String errorNbr);

    int updateByExampleSelective(@Param("record") CheckError record, @Param("example") CheckErrorExample example);

    int updateByExample(@Param("record") CheckError record, @Param("example") CheckErrorExample example);

    int updateByPrimaryKeySelective(CheckError record);

    int updateByPrimaryKey(CheckError record);
}