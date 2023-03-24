package chap10;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); // 현재시간
		Calendar end = Calendar.getInstance(); // 과정종료일2023-8-24
		end.set(2023, 7, 24);
		System.out.println(end);
		
		long nowmili = now.getTimeInMillis(); // 1/1000초 단위
		long endmili = end.getTimeInMillis();

		System.out.println(Math.abs( nowmili - endmili) + "(1/1000초)단위");
		System.out.println(Math.abs( nowmili - endmili)/1000 + "초단위");
		System.out.println(Math.abs( nowmili - endmili)/1000/60 + "분단위");
		System.out.println(Math.abs( nowmili - endmili)/1000/60/60 + "시단위");
		System.out.println(Math.abs( nowmili - endmili)/1000/60/60/24 + "일단위");           
	}	

}
