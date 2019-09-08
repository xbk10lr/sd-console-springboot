package sd.console.mapper;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import sd.console.dto.generate.MerOrderHist;
import sd.console.dto.generate.MerOrderHistExample;

public interface MerOrderHistMapper {
    int countByExample(MerOrderHistExample example);

    int deleteByExample(MerOrderHistExample example);

    int deleteByPrimaryKey(@Param("platSeqNbr") String platSeqNbr, @Param("transDate") Date transDate);

    int insert(MerOrderHist record);

    int insertSelective(MerOrderHist record);

    List<MerOrderHist> selectByExample(MerOrderHistExample example);

    MerOrderHist selectByPrimaryKey(@Param("platSeqNbr") String platSeqNbr, @Param("transDate") Date transDate);

    int updateByExampleSelective(@Param("record") MerOrderHist record, @Param("example") MerOrderHistExample example);

    int updateByExample(@Param("record") MerOrderHist record, @Param("example") MerOrderHistExample example);

    int updateByPrimaryKeySelective(MerOrderHist record);

    int updateByPrimaryKey(MerOrderHist record);
}