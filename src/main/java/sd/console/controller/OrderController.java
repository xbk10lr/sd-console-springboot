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
import sd.console.dto.common.OrderQuery;
import sd.console.dto.generate.MerOrder;
import sd.console.service.OrderService;

@Slf4j
@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@RequestMapping("/searchMerOrder")
	public String searchJob(OrderQuery orderQuery){
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
	
}
