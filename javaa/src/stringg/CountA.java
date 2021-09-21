package stringg;

public class CountA {
	public static void main(String[] args) {
		String s = "vijay dinanath chouhan";
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				System.out.println("a");
				count++;
			}
		}System.out.println(count);

	}

}
