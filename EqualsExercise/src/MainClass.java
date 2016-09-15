
public class MainClass {

	public static void main(String[] args) {
		
		Pojo<String> pojo1 = new Pojo<>();
		Pojo<String> pojo2 = new Pojo<>();
		
		pojo1.setParameter("thename");
		pojo2.setParameter("thename");
		
		System.out.println(pojo1.equals(pojo2));

	}

}
