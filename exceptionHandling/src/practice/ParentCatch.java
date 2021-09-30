package practice;

public class ParentCatch {
	public static void main(String[] args) {
		String a = "yashita";
		try {
			System.out.println("lenght " + a.length());
			System.out.println("char at" + a.charAt(7));
		} catch (StringIndexOutOfBoundsException b) {
			System.err.println("limit extended");
		} catch (RuntimeException c) {
			c.printStackTrace();// no need for s.o.p in it
			// System.out.println("error"+c.getMessage());//[c.getMessage()] use to print
			// the statement as it is
		}

	}

}
