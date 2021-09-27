package polymorphism;

public class Addition {
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public float add(float a,int b) {
		return a+b;
	}
	public void add(float a,double b,int c) {
		System.out.println(a+b+c);
	}
}
