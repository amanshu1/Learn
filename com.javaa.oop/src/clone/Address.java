package clone;

public class Address implements Cloneable{
	public String permanentAddress;
	public String localAddress;
	
	public Address() {
	}
	public Address(String pa,String la) {
		this.permanentAddress=pa;
		this.localAddress=la;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
