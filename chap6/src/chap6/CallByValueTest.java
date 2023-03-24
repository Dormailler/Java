package chap6;

class Data{
	int a = 10;
}

class CallByValue{
	void add(int i) {
		System.out.println("add 메소드내부 출력 = " + i++);
	}
	void addData(Data d2) {
		System.out.println("addData 메소드내부 출력 = " + d2.a++);
	}
}
public class CallByValueTest {

	public static void main(String[] args) {
		CallByValue cb = new CallByValue();
		//int j = 10;
		//cb.add(j);
		//System.out.println("main 메소드 출력 = " + j);
		Data d1 = new Data();
		cb.addData(d1);
		System.out.println("main 메소드 출력 = " + d1.a);
	}

}
