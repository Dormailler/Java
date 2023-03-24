package inner;

class A{
	public void test() {}
	class B{
		void mb() {
			System.out.println("내부 클래스의 메소드 호출");
		}
	}
	void ma() {
		class Local{
			void md() {
				System.out.println("지역 내부 클래스의 메소드 호출");
			}
		}
		Local l = new Local();
		l.md();
	}
	
}

interface Anony{
	void test();
}
public class innerTest {

	public static void main(String[] args) {
		//B b1 = new B();
		A a1 = new A();
		A.B ab= a1.new B();
		ab.mb();
		a1.ma();
		Anony an = new Anony() {
			public void test() {
				System.out.println("anony의 test 메소드 호출");
			}
		};
		an.test();
		
		
	}
}
