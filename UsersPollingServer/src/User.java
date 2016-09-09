import java.util.ArrayList;
import java.util.Random;

public class User extends Thread {
	private Server mServer;
	private Random rand;
	public static String[] sitesDefinitions = 
		{"yahoo.com", "google.com", "msn.com", "nasa.com", "oracle.com", "globant.com"};
	
	private static final int ITERATIONS_TIME = 1;
	
	private float elapsedTime = 0;
	
	private ArrayList<String> localCount;
	
	public User(Server server){
		mServer = server;
		rand = new Random();
		localCount = new ArrayList<String>();
	}
	
	public void run(){
		long initialTime = System.currentTimeMillis();
		
		while (elapsedTime <= ITERATIONS_TIME){
			int index = rand.nextInt(sitesDefinitions.length);
			mServer.addMessage(sitesDefinitions[index]);
			
			elapsedTime = System.currentTimeMillis() - initialTime;
			
			localCount.add(sitesDefinitions[index]);
			System.out.println(sitesDefinitions[index]);
		}
		
		if (elapsedTime > ITERATIONS_TIME){
			MainClass.deployData(localCount);
		}
	}
}
