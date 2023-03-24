package casting;

class Parent{
	int su = 10;
	void print() {
		System.out.println(su);
	}
	void mp() {
		System.out.println("Parent 클래스");
	}
}

class Child1 extends Parent{
	int su = 20;
	void print() {
		System.out.println(su);
	}
	void mc() {
		System.out.println("Child1 클래스");
	}
}
public class CastingTest {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		System.out.println(p1.su);
		p1.print();
		p1.mp();
		Child1 c1 = new Child1();
		System.out.println(c1.su);
		c1.print();
		c1.mp();
		c1.mc();
		Parent p2 = new Child1();
		System.out.println(p2.su);
		p2.print();
		p2.mp();
		
		Child1 c2 = (Child1)p2;
		c2.mc();
		System.out.println(c2.su);
		
		Parent list[] = new Parent[3];
		list[0] = p1;
		list[1] = c1;
		list[2] = p2; // 자동형변환 발생
		for(int i = 0; i< list.length; i++) {
			list[i].mp();
			if(list[i] instanceof Child1)
				((Child1)list[1]).mc();
		}
	}

}
