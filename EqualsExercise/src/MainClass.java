
public class MainClass {

	public static void main(String[] args) {
		
		Pojo pojo1 = new Pojo();
		Pojo pojo2 = new Pojo();
		
		pojo1.setName("thename");
		pojo2.setName("thename");
		
		System.out.println(pojo1.equals(pojo2));

	}

}
