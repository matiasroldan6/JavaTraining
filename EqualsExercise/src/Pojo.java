
public class Pojo {

	private String name;
	
	public void setName(String name){
		this.name = name;
	}
	
	public void foo(){
		/* filler method */
	}
	
	@Override
	public boolean equals(Object o){
		
		if (o == null){
			return false;
		}
		
		if (!(o instanceof Pojo)){
			return false;
		}
		
		Pojo p = (Pojo)o;
		
		return this.name.equals(p.name);
		
	}
}
