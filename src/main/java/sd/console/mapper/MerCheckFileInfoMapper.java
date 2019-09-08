package sd.console.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sd.console.dto.generate.MerCheckFileInfo;
import sd.console.dto.generate.MerCheckFileInfoExample;

public interface MerCheckFileInfoMapper {
    int countByExample(MerCheckFileInfoExample example);

    int deleteByExample(MerCheckFileInfoExample example);

    int deleteByPrimaryKey(String checkNbr);

    int insert(MerCheckFileInfo record);

    int insertSelective(MerCheckFileInfo record);

    List<MerCheckFileInfo> selectByExample(MerCheckFileInfoExample example);

    MerCheckFileInfo selectByPrimaryKey(String checkNbr);

    int updateByExampleSelective(@Param("record") MerCheckFileInfo record, @Param("example") MerCheckFileInfoExample example);

    int updateByExample(@Param("record") MerCheckFileInfo record, @Param("example") MerCheckFileInfoExample example);

    int updateByPrimaryKeySelective(MerCheckFileInfo record);

    int updateByPrimaryKey(MerCheckFileInfo record);
}