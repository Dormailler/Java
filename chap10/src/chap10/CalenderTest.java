package chap10;

import java.util.Calendar;

public class CalenderTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH) + 1;
		int hour = cal.get(Calendar.HOUR_OF_DAY); 
		int min = cal.get(Calendar.MINUTE); 
		int second = cal.get(Calendar.SECOND);
		
		String[] weekdays = {"","일","월","화","수","목","금","토"};
		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + ":"
		+ weekdays[cal.get(Calendar.DAY_OF_WEEK)]);
		
		cal.set(min, second);

	}

}
