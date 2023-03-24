package chap6;

import java.util.Arrays;

class Overload{
	int add(int i,int j) {
		return i+j;
	}
	String add(String i, String j) {
		return i+j;
	}
	double add(double i, double j) {
		return i+j;
	}
}
public class OverloadingTest {

	public static void main(String[] args) {
		Overload o = new Overload();
		String result1 = o.add("java ", "program");
		int result2 = o.add(1, 2);
		double result3 = o.add(1, 2.1);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		int decimal = Integer.parseInt("100");
		int bin = Integer.parseInt("100",2);
		int bin2= Integer.parseInt("100abc",0,3,2);
		System.out.println("십진수로 변환 = " + decimal);
		System.out.println("이진수로 변환 = " + bin);
		System.out.println("이진수로 변환 = " + bin2);
		
	

	}

}
