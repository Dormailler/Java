package chap5;

import java.util.Arrays;

public class MainTest {

	public static void main(String[] args) {
		System.out.println("입력된 변수의 갯수 = " + args.length);
		System.out.println(Arrays.toString(args)); 
		System.out.println(args[0] + args[1]);
		int f = Integer.parseInt(args[0]);
		int g = Integer.parseInt(args[1]);
		System.out.println(f+g);
		
		double third = Double.parseDouble(args[0]);
		System.out.println(third);
		String s1 = "j";
		String s2 = "j";
		String s3 = new String("j");
		String s4 = new String("j");
		String s5 = "j";
		System.out.println(s1.equals(s4));
	}

}
