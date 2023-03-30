package test;

public class InitTest {
	int i;
	boolean b;
	char c;
	double d;
	String s;
	InitTest(int i,String s){
		this.i = i;
		this.s = s;
	}
	public static void main(String[] args) {
		InitTest it = new InitTest(100,"문자열 초기화");
		System.out.println(it.i);
		System.out.println(it.b);
		System.out.println(it.c);
		System.out.println(it.d);
		System.out.println(it.s);
		
		int i = 0;
		String s;
		if(i == 0) {
			s = null;
		}
		else {
			s = "aaa";
		}
		System.out.println(i);
		System.out.println(s);
	}

}
