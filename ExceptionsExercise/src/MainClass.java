import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class MainClass {

	private static File file;
	
	public static void main(String[] args) {

		try{
			file = new File("c:\\file.txt");
		}
		catch (NullPointerException e){
			System.out.println(e.getMessage());
		}
		
		writeToFile();
		try{
			foo(0);
		}
		catch(MyCustomException e){
			System.out.println(e.getMessage());
		}
	}

	private static void foo(int i) throws MyCustomException{
		if (i <= 0){
			throw new MyCustomException("Number must be greater than zero");
		}
	}
	
	private static void writeToFile(){
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(file));){
			writer.write("writing");
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}
