package sd.console.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONArray;
import sd.console.dto.common.ChannelOrderQuery;
import sd.console.dto.common.ErrorQuery;
import sd.console.dto.common.OrderQuery;
import sd.console.dto.common.QuerySum;
import sd.console.dto.generate.ChannelOrder;
import sd.console.dto.generate.CheckError;
import sd.console.dto.generate.MerOrder;
import sd.console.dto.generate.MerOrderSum;
import sd.console.service.OrderService;

@Slf4j
@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@RequestMapping("/searchMerOrder")
	public String searchMerOrder(OrderQuery orderQuery){
		log.info(orderQuery.toString());
		int page = orderQuery.getPage();
		int rows = orderQuery.getRows();
        PageHelper.startPage(page, rows);//设置数据库分页查询的范围
		List<MerOrder> merOrders = orderService.searchMerOrder(orderQuery,page,rows);
        PageInfo<MerOrder> pageInfo=new PageInfo<>(merOrders);
		Map<String,Object> m=new HashMap<String,Object>();
		m.put("total", pageInfo.getTotal());
		m.put("rows", merOrders);
		JSONArray js=JSONArray.fromObject(m);
		String res = js.toString();
		log.info(js.toString());
		return res.substring(1, res.length()-1);
	}
	
	@RequestMapping("/searchChannelOrder")
	public String searchChannelOrder(ChannelOrderQuery channelOrderQuery){
		log.info(channelOrderQuery.toString());
		int page = channelOrderQuery.getPage();
		int rows = channelOrderQuery.getRows();
        PageHelper.startPage(page, rows);//设置数据库分页查询的范围
		List<ChannelOrder> channelOrders = orderService.searchChannelOrder(channelOrderQuery, page, rows);
		log.info(channelOrders.get(0).getTransDate().toString());
        PageInfo<ChannelOrder> pageInfo=new PageInfo<>(channelOrders);
		Map<String,Object> m=new HashMap<String,Object>();
		m.put("total", pageInfo.getTotal());
		m.put("rows", channelOrders);
		JSONArray js=JSONArray.fromObject(m);
		String res = js.toString();
		log.info(js.toString());
		return res.substring(1, res.length()-1);
	}
	
	@RequestMapping("/searchOrderErrors")
	public String searchOrderErrors(ErrorQuery errorQuery){
		log.info(errorQuery.toString());
		int page = errorQuery.getPage();
		int rows = errorQuery.getRows();
        PageHelper.startPage(page, rows);//设置数据库分页查询的范围
		List<CheckError> checkErrors = orderService.searchCheckError(errorQuery, page, rows);
        PageInfo<CheckError> pageInfo=new PageInfo<>(checkErrors);
		Map<String,Object> m=new HashMap<String,Object>();
		m.put("total", pageInfo.getTotal());
		m.put("rows", checkErrors);
		JSONArray js=JSONArray.fromObject(m);
		String res = js.toString();
		log.info(js.toString());
		return res.substring(1, res.length()-1);
	} 
	
	@RequestMapping("/searchMerSum")
	public String searchMerSum(QuerySum querySum){
		log.info(querySum.toString());
		int page = querySum.getPage();
		int rows = querySum.getRows();
        PageHelper.startPage(page, rows);//设置数据库分页查询的范围
		List<MerOrderSum> querySums = orderService.searchMerSum(querySum, page, rows);
        PageInfo<MerOrderSum> pageInfo=new PageInfo<>(querySums);
		Map<String,Object> m=new HashMap<String,Object>();
		m.put("total", pageInfo.getTotal());
		m.put("rows", querySums);
		JSONArray js=JSONArray.fromObject(m);
		String res = js.toString();
		log.info(js.toString());
		return res.substring(1, res.length()-1);
	}
}
