package sd.console.service;

import java.util.List;

import sd.console.dto.common.OrderQuery;
import sd.console.dto.generate.MerOrder;

public interface OrderService {

	public List<MerOrder> searchMerOrder(OrderQuery orderQuery,Integer page,Integer rows);
}
