package polymorphism;

public class TestMethodOverloading {
	public static void main(String[] args) {
		Addition a = new Addition();
		a.add(10, 20);
		a.add(3, 4, 5);
		a.add(5, 10);
		a.add(3, 4.5, 5);
	}
}
