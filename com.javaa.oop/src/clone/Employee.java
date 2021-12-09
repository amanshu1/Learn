package clone;

public class Employee implements Cloneable {
	public String name;
	public Address address;
	
	public Employee() {
		
	}
	public Employee(String name) {
		this.name=name;
		address=new Address();
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee a=(Employee)super.clone();
		a.address =(Address)a.clone();
		return a;
	}
}
