import java.util.HashMap;
import java.util.Map;

public class Server {

	private Map<String, Integer> sitesMap;
	
	public Server(){
		sitesMap = new HashMap<String, Integer>();
	}
	
	public void addMessage(String site){
		synchronized(this){
			if (sitesMap.containsKey(site)){
				int currentCount = sitesMap.get(site);
				sitesMap.put(site, currentCount+1);
			}
			else{
				sitesMap.put(site, 1);
			}
		}
	}
	
	public Map<String, Integer> getMap(){
		return sitesMap;
	}
}
