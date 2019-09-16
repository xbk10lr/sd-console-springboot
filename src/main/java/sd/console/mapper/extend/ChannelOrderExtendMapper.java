package sd.console.mapper.extend;

import java.util.List;

import sd.console.dto.common.ChannelOrderQuery;
import sd.console.dto.generate.ChannelOrder;

public interface ChannelOrderExtendMapper {

    List<ChannelOrder> queryChannelOrder(ChannelOrderQuery channelOrderQuery);

}