
public class Counter {
	private int counter;
	
	public Counter(){
		counter = 1;
	}
	
	public synchronized void increment(){
		counter++;
	}
	
	public int getCounter(){
		return counter;
	}
}
