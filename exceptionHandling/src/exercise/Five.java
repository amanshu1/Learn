package exercise;

public class Five {
	public static void main(String[] args) {
		String a="yashita";
		try {
			System.out.println("lenght "+a.length());
			System.out.println("char at"+a.charAt(7));
		}catch(IndexOutOfBoundsException |NullPointerException  b) {
			System.err.println("limit extended");	
		}
	}
}
