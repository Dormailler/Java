package chap9;

public class ObjectClassTest {

	public static void main(String[] args) {
		MyObject o1 = new MyObject("spring");
		MyObject o2 = new MyObject("테스트");
		MyObject o3 = new MyObject("테스트");
		String s4 = new String("테스트");
		System.out.println(o1);	
		System.out.println(o2);
		System.out.println(o3);
		if(o1.equals(o2)) { // 주소비교
			System.out.println("o1.equals(o2) true");
		}
		if(o2.equals(o3)) { // 주소비교
			System.out.println("o2.equals(o3) true");
		}
		if(o2.equals(s4)) { // 주소비교
			System.out.println("o2.equals(o4) true");
		}
		if(o1 == o2) {
			System.out.println("o1 == o2 true");
		}
	}

}
class MyObject{
	String msg;
	MyObject(String msg){
		this.msg = msg;
	}
	@Override
	public String toString() {
		return msg;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyObject) {
			return msg.equals(((MyObject)obj).msg);
		}
		else return false;
	}
	
}