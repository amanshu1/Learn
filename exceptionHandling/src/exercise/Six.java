package exercise;

public class Six {
	public void first() throws ExampleException {
		try {
			second();
		} catch (ExampleException a) {
			ExampleException c=new ExampleException();
			throw c;
		}
		
	}
	public void second() throws ExampleException {
		ExampleException a=new ExampleException();
		int b=12;
		if(b%3==0) {
			throw a;	
		}		
	}
	public static void main(String[] args) throws ExampleException {
		Six d=new Six();
		d.first();
	}
}
