package sd.console.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import sd.console.util.HttpClient;
import sd.console.util.HttpConfig;

@Slf4j
@Service
public class HttpServiceImpl implements HttpService{

	public Boolean send(String requestUrl,Map<String,String> dataMap){
		log.info("requestUrl:"+requestUrl+",dataMap:"+dataMap);
		HttpClient client = new HttpClient();
		HttpConfig httpConfig = new HttpConfig();
		httpConfig.setConnectionTimeOut(30000);
		httpConfig.setReadTimeOut(30000);
		httpConfig.setEncoding("UTF-8");
		httpConfig.setRequestUrl(requestUrl);
		try {
			long start = System.currentTimeMillis();
			String res = client.send(dataMap, httpConfig);
			log.info("success res:"+res+",take time:"+(System.currentTimeMillis()-start)+"ms");
			return Boolean.valueOf(res);
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}

	}
}
