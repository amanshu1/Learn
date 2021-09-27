package polymorphism;

public class Businessman extends Person implements Richman, SocialWorker{
	//private String name;
	//private String address;
	@Override
	public void helpToOther() {
		System.out.println("help to others");
	}
	@Override
	public void earnMoney() {
		System.out.println("to earn money");
	
	}
	@Override
	public void donation() {
		System.out.println("to donate");
	}
	@Override
	public void party() {
		System.out.println("to party");
	}
	public static void main(String[] args) {
		Businessman a = new Businessman();
		a.earnMoney();
		a.donation();
		a.party();
		a.helpToOther();
		a.setAddress("51,khasgi ka bagicha");
		a.setName("yashita");
		System.out.println("name=" + a.getName());
		System.out.println("address"+a.getAddress());
		
		
	}
	

}
