package sd.console.service;

import java.util.Map;

public interface HttpService {

	public Boolean send(String requestUrl,Map<String,String> dataMap);
}
