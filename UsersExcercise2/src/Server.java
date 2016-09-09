import java.util.HashMap;
import java.util.Map;

public class Server {

	private Map<String, Counter> sitesMap;
	
	public Server(){
		sitesMap = new HashMap<String, Counter>();
	}
	
	public void addMessage(String site){
		synchronized(this){
			if (sitesMap.containsKey(site)){
				sitesMap.get(site).increment();
			}else{
				sitesMap.put(site, new Counter());
			}
		}
	}
	
	public Map<String, Integer> getConvertedMap(){
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i=0; i<User.sitesDefinitions.length; i++){
			if (sitesMap.containsKey(User.sitesDefinitions[i])){
				map.put(User.sitesDefinitions[i], sitesMap.get(User.sitesDefinitions[i]).getCounter());
			}
		}
		
		return map;
	}
}
