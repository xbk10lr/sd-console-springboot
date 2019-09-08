package sd.console.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sd.console.dto.generate.MerOrderSum;
import sd.console.dto.generate.MerOrderSumExample;

public interface MerOrderSumMapper {
    int countByExample(MerOrderSumExample example);

    int deleteByExample(MerOrderSumExample example);

    int deleteByPrimaryKey(String settleNbr);

    int insert(MerOrderSum record);

    int insertSelective(MerOrderSum record);

    List<MerOrderSum> selectByExample(MerOrderSumExample example);

    MerOrderSum selectByPrimaryKey(String settleNbr);

    int updateByExampleSelective(@Param("record") MerOrderSum record, @Param("example") MerOrderSumExample example);

    int updateByExample(@Param("record") MerOrderSum record, @Param("example") MerOrderSumExample example);

    int updateByPrimaryKeySelective(MerOrderSum record);

    int updateByPrimaryKey(MerOrderSum record);
}