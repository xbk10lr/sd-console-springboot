package sd.console.service;

import java.util.List;

import org.springframework.stereotype.Service;

import sd.console.dto.common.OrderQuery;
import sd.console.dto.generate.MerOrder;

@Service
public class OrderServiceImpl implements OrderService {

	@Override
	public List<MerOrder> searchMerOrder(OrderQuery orderQuery, Integer page, Integer rows) {
		// TODO Auto-generated method stub
		return null;
	}

}
