package chap6;

class Sample{
	int member = 10;
	void test() {
		int local = 20;
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println(member);
		System.out.println(local);
	}
	void test2() {
		System.out.println(member);
	}
	int add(int a, int b) {
		int result = a+b;
		return result;
	}
	int mul(int a, int b) {
		return a*b;
	}
	int div(int a, int b) {
		if(b != 0) {
			return a/b;
		}
		return 0;
	}
	void div2(int a, int b) {
		if(b != 0) {
			System.out.println(a/b);
		}
		System.out.println("0으로 나눌수 없습니다.");
	}
	
}
public class VariableTest {
	void m1(){
		System.out.println("m1호출");
	}
	static void m2() {
		System.out.println("m2호출");
	}
	public static void main(String[] args) {
		m2();
		VariableTest vt = new VariableTest();
		vt.m1();
		Sample s = new Sample();
		System.out.println(s.add(10, 20));
		s.div2(10, 5);
		System.out.println(s.mul(10, 20));
	}

}
