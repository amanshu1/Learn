package stringg;

public class ReplaceAlll {
	public static void main(String[] args) {
		String pre="you are pretty";
		String[] pr = pre.split(" ");
		for (String p : pr) {
			for(int i=p.length()-1;i>=0;i--) {
				System.out.print(p.charAt(i));
			}
			System.out.println(" ");
		}
	}

}
