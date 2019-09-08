package sd.console.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sd.console.dto.generate.SysInfo;
import sd.console.dto.generate.SysInfoExample;

public interface SysInfoMapper {
    int countByExample(SysInfoExample example);

    int deleteByExample(SysInfoExample example);

    int deleteByPrimaryKey(String sysNbr);

    int insert(SysInfo record);

    int insertSelective(SysInfo record);

    List<SysInfo> selectByExample(SysInfoExample example);

    SysInfo selectByPrimaryKey(String sysNbr);

    int updateByExampleSelective(@Param("record") SysInfo record, @Param("example") SysInfoExample example);

    int updateByExample(@Param("record") SysInfo record, @Param("example") SysInfoExample example);

    int updateByPrimaryKeySelective(SysInfo record);

    int updateByPrimaryKey(SysInfo record);
}