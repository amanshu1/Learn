package clone;

public class Department {
	public String departmentName;
	public Employee employe;
	public Address addres;
	
	public Department() {
		
	}
	public Department(String departmentName) {
		this.departmentName=departmentName;
		addres=new Address("51,khasgi ka bagicha","patnipura");
		employe=new Employee("yashita");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Department d=(Department)super.clone();
		d.addres=(Address)addres.clone();
		d.employe=(Employee)employe.clone();
		return d;
	}
	

}
