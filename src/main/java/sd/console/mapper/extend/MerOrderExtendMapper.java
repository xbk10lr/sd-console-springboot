package sd.console.mapper.extend;

import java.util.List;

import sd.console.dto.common.OrderQuery;
import sd.console.dto.generate.MerOrder;

public interface MerOrderExtendMapper {

    List<MerOrder> queryMerOrder(OrderQuery orderQuery);

}