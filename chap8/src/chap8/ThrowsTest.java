package chap8;

class A{
	void m1(int i) throws ArithmeticException {
		System.out.println(100 / i);
	}
	void m2() {
		m1(100);
	}
	void m3() {
		m1(0);
	}
	void m4() {
		try {
			m1(0);
			}
			catch(ArithmeticException e) {
				m1(100);
			}
	}
}
public class ThrowsTest {

	public static void main(String[] args) throws ArithmeticException {
		A a1 = new A();
		a1.m2();
		a1.m3();
		a1.m4();

	}

}
