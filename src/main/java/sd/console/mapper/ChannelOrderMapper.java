package sd.console.mapper;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import sd.console.dto.generate.ChannelOrder;
import sd.console.dto.generate.ChannelOrderExample;

public interface ChannelOrderMapper {
    int countByExample(ChannelOrderExample example);

    int deleteByExample(ChannelOrderExample example);

    int deleteByPrimaryKey(@Param("orderSeqNbr") String orderSeqNbr, @Param("transDate") Date transDate);

    int insert(ChannelOrder record);

    int insertSelective(ChannelOrder record);

    List<ChannelOrder> selectByExample(ChannelOrderExample example);

    ChannelOrder selectByPrimaryKey(@Param("orderSeqNbr") String orderSeqNbr, @Param("transDate") Date transDate);

    int updateByExampleSelective(@Param("record") ChannelOrder record, @Param("example") ChannelOrderExample example);

    int updateByExample(@Param("record") ChannelOrder record, @Param("example") ChannelOrderExample example);

    int updateByPrimaryKeySelective(ChannelOrder record);

    int updateByPrimaryKey(ChannelOrder record);
}