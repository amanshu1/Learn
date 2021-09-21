package dateTime;

import java.time.LocalDate;
import java.time.Period;

public class Age {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate dob = LocalDate.of(2002, 12, 04);
		Period years = Period.between(today, dob);
		System.out.println(dob);
		System.out.println(today);
		System.out.println(years);

	}

}
