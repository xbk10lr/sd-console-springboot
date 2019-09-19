package sd.console.service;

import java.util.List;

import sd.console.dto.common.ChannelOrderQuery;
import sd.console.dto.common.ErrorQuery;
import sd.console.dto.common.OrderQuery;
import sd.console.dto.common.QuerySum;
import sd.console.dto.generate.ChannelOrder;
import sd.console.dto.generate.ChannelOrderSum;
import sd.console.dto.generate.CheckError;
import sd.console.dto.generate.MerOrder;
import sd.console.dto.generate.MerOrderSum;

public interface OrderService {

	public List<MerOrder> searchMerOrder(OrderQuery orderQuery,Integer page,Integer rows);
	
	public List<ChannelOrder> searchChannelOrder(ChannelOrderQuery orderQuery,Integer page,Integer rows);
	
	public List<CheckError> searchCheckError(ErrorQuery errorQuery,Integer page,Integer rows);
	
	public List<MerOrderSum> searchMerSum(QuerySum querySum,Integer page,Integer rows);

	public List<ChannelOrderSum> searchChannelSum(QuerySum querySum,Integer page,Integer rows);


}
