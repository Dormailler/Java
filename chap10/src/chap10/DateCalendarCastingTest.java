package chap10;

import java.util.Calendar;
import java.util.Date;

public class DateCalendarCastingTest {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTime());
		Date now2 = now.getTime(); // Calendar -> Date
		System.out.println("타입=" + now2.getClass().getName());

		//Date -> Calendar
		Date now3 = new Date();
		now.setTime(now3);
		System.out.println("타입=" + now.getClass().getName());
	}

}
