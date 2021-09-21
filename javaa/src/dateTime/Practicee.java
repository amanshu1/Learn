package dateTime;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Practicee {
	public static void main(String[] args) {
		Date d = new Date ();
		SimpleDateFormat a = new SimpleDateFormat("yyyy.MMMMMMMMM.dd GGG hh:mm aaa");
		String dat = a.format(d);
		System.out.println(dat);
	}

}
