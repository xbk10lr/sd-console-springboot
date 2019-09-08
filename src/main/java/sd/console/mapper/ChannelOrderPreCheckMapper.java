package sd.console.mapper;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import sd.console.dto.generate.ChannelOrderPreCheck;
import sd.console.dto.generate.ChannelOrderPreCheckExample;

public interface ChannelOrderPreCheckMapper {
    int countByExample(ChannelOrderPreCheckExample example);

    int deleteByExample(ChannelOrderPreCheckExample example);

    int deleteByPrimaryKey(@Param("orderSeqNbr") String orderSeqNbr, @Param("transDate") Date transDate);

    int insert(ChannelOrderPreCheck record);

    int insertSelective(ChannelOrderPreCheck record);

    List<ChannelOrderPreCheck> selectByExample(ChannelOrderPreCheckExample example);

    ChannelOrderPreCheck selectByPrimaryKey(@Param("orderSeqNbr") String orderSeqNbr, @Param("transDate") Date transDate);

    int updateByExampleSelective(@Param("record") ChannelOrderPreCheck record, @Param("example") ChannelOrderPreCheckExample example);

    int updateByExample(@Param("record") ChannelOrderPreCheck record, @Param("example") ChannelOrderPreCheckExample example);

    int updateByPrimaryKeySelective(ChannelOrderPreCheck record);

    int updateByPrimaryKey(ChannelOrderPreCheck record);
}