package basic;

public class PrimeNo {
	public static void main(String[] args) {
		int x = 23;
		for (int i = 2; i <= x; i++) {
			if (x % i == 0) {
				System.out.println("its not prime");
				break;
			} else {
				System.out.println("prime");
				break;
			}
		}
	}
}
