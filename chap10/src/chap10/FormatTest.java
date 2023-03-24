package chap10;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FormatTest {

	public static void main(String[] args) {
		Calendar input = Calendar.getInstance();
		//2013 2 12 23 34 56
		int argsInt[] = new int[args.length];
		for(int i = 0 ; i < args.length; i++) {
			argsInt[i] = Integer.parseInt(args[i]);
		}
		input.set(argsInt[0],argsInt[1],argsInt[2],argsInt[3],argsInt[4],argsInt[5]);
		SimpleDateFormat f = new SimpleDateFormat
				("지금은 yyyy년도 MM월 dd일 E요일 HH시 mm분 ss초입니다.");
		//지금은 2023년도 3월 12일 일요일 23시 34분 56초입니다.
		String result = f.format(input.getTime());
		System.out.println(result);
		
		double d = 1234.5678;
		d = -12.5678;
		d = 123.450;
		System.out.println(d);
		DecimalFormat f2 = new DecimalFormat("####.00");
		System.out.println(f2.format(d));
	}

}
