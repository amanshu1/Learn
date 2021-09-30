package practice;

public class TryCatch {
	public static void main(String[] args) {
		try {
			int a = 10 / 0;
			System.out.println(a);
		} catch (ArithmeticException b) {
			System.err.println("error / by 0");
		} finally {
			System.out.println("exception handling");
		}
	}

}
