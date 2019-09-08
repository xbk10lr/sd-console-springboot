package sd.console.mapper;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import sd.console.dto.generate.CheckChannelReg;
import sd.console.dto.generate.CheckChannelRegExample;

public interface CheckChannelRegMapper {
    int countByExample(CheckChannelRegExample example);

    int deleteByExample(CheckChannelRegExample example);

    int deleteByPrimaryKey(@Param("channelCode") String channelCode, @Param("checkDate") Date checkDate);

    int insert(CheckChannelReg record);

    int insertSelective(CheckChannelReg record);

    List<CheckChannelReg> selectByExample(CheckChannelRegExample example);

    CheckChannelReg selectByPrimaryKey(@Param("channelCode") String channelCode, @Param("checkDate") Date checkDate);

    int updateByExampleSelective(@Param("record") CheckChannelReg record, @Param("example") CheckChannelRegExample example);

    int updateByExample(@Param("record") CheckChannelReg record, @Param("example") CheckChannelRegExample example);

    int updateByPrimaryKeySelective(CheckChannelReg record);

    int updateByPrimaryKey(CheckChannelReg record);
}