package chap6;

class Other{
	String s1 = "Other 인스턴스변수";
	static String s2 = "Other 클래스변수";
}
public class StaticTest {
	int i = 10;
	static int j = 20;
	void m1() {
		System.out.println("nonstatic메소드(인스턴스메소드)");
	}
	static void m2() {
		System.out.println("static메소드(클래스메소드)");
	}
	public static void main(String[] args) {
		System.out.println(j);
		m2();
		StaticTest st = new StaticTest();
		System.out.println(st.i);
		st.m1();	
		
		System.out.println(Other.s2);
		System.out.println(new Other().s1);
	}

}
