package inter;

interface I{
	void ma();
	default void mb() {
		System.out.println("추가되어도 기존 설계 변경 없음- 선택적 오버라이딩");
	}
	static void mc() {
		System.out.println("추가되어도 기존 설계 변경 없음-오버라이딩 불가");
	};

}

class A implements I{
	@Override
	public void ma() {
		System.out.println("A클래스 ma 메소드 오버라이딩");
	}
	
}
public class InterfaceTest3 {

	public static void main(String[] args) {
		A a1 = new A();
		a1.mb();
		I.mc();

	}

}
