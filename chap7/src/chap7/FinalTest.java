package chap7;

final class Math{
	final double pi = 3.14;
	int abs(int i) {
		if(i>=0) return i;
		else return -1 * i;
	}
	void test() {
		System.out.println("Math Test");
	}
}
class MyMath{
	Math m = new Math();
	void test() {
		System.out.println("MyMath Test");
	}	
}

class MyString{
	String s = new String("");
}
public class FinalTest {

	public static void main(String[] args) {
		Math m = new Math();
		System.out.println(m.pi);

	}

}
