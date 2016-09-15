
public class Pojo<T> {

	private T t;
	
	public void setParameter(T t){
		this.t = t;
	}
	
	public void foo(){
		/* filler method */
	}
	
	@Override
	public boolean equals(Object o){
		
		if (o == this){
			return true;
		}
		
		if ((o == null) || (o.getClass() != this.getClass())){
			return false;
		}
		
		Pojo p = (Pojo)o;
		
		return this.t.equals(p.t);
		
	}
}
