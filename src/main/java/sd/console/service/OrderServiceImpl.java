package sd.console.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.StringUtil;

import sd.console.dto.common.ChannelOrderQuery;
import sd.console.dto.common.ErrorQuery;
import sd.console.dto.common.OrderQuery;
import sd.console.dto.common.QuerySum;
import sd.console.dto.generate.ChannelOrder;
import sd.console.dto.generate.ChannelOrderSum;
import sd.console.dto.generate.ChannelOrderSumExample;
import sd.console.dto.generate.CheckError;
import sd.console.dto.generate.CheckErrorExample;
import sd.console.dto.generate.MerOrder;
import sd.console.dto.generate.MerOrderSum;
import sd.console.dto.generate.MerOrderSumExample;
import sd.console.mapper.ChannelOrderSumMapper;
import sd.console.mapper.CheckErrorMapper;
import sd.console.mapper.MerOrderSumMapper;
import sd.console.mapper.extend.ChannelOrderExtendMapper;
import sd.console.mapper.extend.MerOrderExtendMapper;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private MerOrderExtendMapper merOrderExtendMapper;
	
	@Autowired
	private ChannelOrderExtendMapper channelOrderExtendMapper;
	
	@Autowired
	private CheckErrorMapper checkErrorMapper;
	
	@Autowired
	private MerOrderSumMapper merOrderSumMapper;
	
	@Autowired
	private ChannelOrderSumMapper channelOrderSumMapper;
	
	@Override
	public List<MerOrder> searchMerOrder(OrderQuery orderQuery, Integer page, Integer rows) {
		return merOrderExtendMapper.queryMerOrder(orderQuery);
	}

	@Override
	public List<ChannelOrder> searchChannelOrder(ChannelOrderQuery channelOrderQuery, Integer page, Integer rows) {
		
		return channelOrderExtendMapper.queryChannelOrder(channelOrderQuery);
	}

	@Override
	public List<CheckError> searchCheckError(ErrorQuery errorQuery, Integer page, Integer rows) {
		CheckErrorExample example = new CheckErrorExample();
		if(StringUtil.isNotEmpty(errorQuery.getErrorStatus())){
			example.createCriteria().andErrorStatusEqualTo(errorQuery.getErrorStatus());
		}
		if(StringUtil.isNotEmpty(errorQuery.getErrorTyp())){
			example.createCriteria().andErrorTypEqualTo(errorQuery.getErrorTyp());
		}
		if(StringUtil.isNotEmpty(errorQuery.getPlatSeqNbr())){
			example.createCriteria().andPlatSeqNbrEqualTo(errorQuery.getPlatSeqNbr());
		}
		if(errorQuery.getStartDate()!=null && errorQuery.getEndDate()!=null){
			example.createCriteria().andClearDateBetween(errorQuery.getStartDate(), errorQuery.getEndDate());
		} else if(errorQuery.getEndDate()!=null){
			example.createCriteria().andClearDateLessThanOrEqualTo(errorQuery.getEndDate());
		} else if(errorQuery.getStartDate()!=null){
			example.createCriteria().andClearDateGreaterThanOrEqualTo(errorQuery.getStartDate());
		}
		return checkErrorMapper.selectByExample(example);
	}

	@Override
	public List<MerOrderSum> searchMerSum(QuerySum querySum, Integer page, Integer rows) {
		MerOrderSumExample example = new MerOrderSumExample();
		if(StringUtil.isNotEmpty(querySum.getMerNo())){
			example.createCriteria().andMerNoEqualTo(querySum.getMerNo());
		}
		if(querySum.getStartDate()!=null && querySum.getEndDate()!=null){
			example.createCriteria().andClearDateBetween(querySum.getStartDate(), querySum.getEndDate());
		} else if(querySum.getEndDate()!=null){
			example.createCriteria().andClearDateLessThanOrEqualTo(querySum.getEndDate());
		} else if(querySum.getStartDate()!=null){
			example.createCriteria().andClearDateGreaterThanOrEqualTo(querySum.getStartDate());
		}
		return merOrderSumMapper.selectByExample(example);
	}

	@Override
	public List<ChannelOrderSum> searchChannelSum(QuerySum querySum, Integer page, Integer rows) {
		ChannelOrderSumExample example = new ChannelOrderSumExample();
		if(StringUtil.isNotEmpty(querySum.getChannelCode())){
			example.createCriteria().andChannelCodeEqualTo(querySum.getChannelCode());
		}
		if(querySum.getStartDate()!=null && querySum.getEndDate()!=null){
			example.createCriteria().andClearDateBetween(querySum.getStartDate(), querySum.getEndDate());
		} else if(querySum.getEndDate()!=null){
			example.createCriteria().andClearDateLessThanOrEqualTo(querySum.getEndDate());
		} else if(querySum.getStartDate()!=null){
			example.createCriteria().andClearDateGreaterThanOrEqualTo(querySum.getStartDate());
		}
		return channelOrderSumMapper.selectByExample(example);
	}

}
