package abstraction;

public abstract class Animal {
	
	public String name;
	
	public abstract void sound ();
	
	public abstract void getName ();

	public void setName(String name) {
		this.name = name;
	}
	

}
