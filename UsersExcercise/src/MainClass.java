import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainClass {
	
	private static Map<String, Integer> localMap;
	private static int iterationsCounter;
	
	private static final int NUMBER_OF_USERS = 3;
	
	private static Server server;
	
	public static void main(String[] args){
		server = new Server();
		
		User userA = new User(server);
		User userB = new User(server);
		User userC = new User(server);
		
		userA.start();
		userB.start();
		userC.start();
		
		localMap = new HashMap<String, Integer>();
	}
	
	public static synchronized void deployData(ArrayList<String> userCount)
	{
		for (int i=0; i<userCount.size(); i++){
			if (localMap.containsKey(userCount.get(i))){
				int count = localMap.get(userCount.get(i));
				localMap.put(userCount.get(i), count+1);
			}else{
				localMap.put(userCount.get(i), 1);
			}
		}
		
		iterationsCounter++;
		if (iterationsCounter == NUMBER_OF_USERS){
			onFinish();
		}
	}
	
	private static void onFinish(){
		System.out.println("SERVER DATA:");
		System.out.println(server.getMap().entrySet());
		System.out.println("LOCAL DATA:");
		System.out.println(localMap.entrySet());
	}
}
