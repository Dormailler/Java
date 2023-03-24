package chap10;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		Date userdate = new Date(2023,1,1,10,10,10);
		System.out.println(userdate);

	}

}
