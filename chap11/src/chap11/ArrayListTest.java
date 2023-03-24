package chap11;

import java.util.ArrayList;

class Employee{
	int id; String name; double pay;
	public Employee(int id, String name, double pay) {
		super();
		this.id = id;
		this.name = name;
		this.pay = pay;
	}
	@Override
	public String toString() {
		String st = "id : " + id + " name : " +name + " pay : " + pay;
		return st;
	}
	
}
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(5);
		
		list.add("java");
		list.add(100);
		list.add(3); // 1번 인덱스 자리에 넣기
		list.add("spring");
		list.add(200);
		// 자동 5개 증가
		list.add(3.14);
		list.remove(1);
		
		Employee e1 = new Employee(100,"김사원",50000);
		list.add(e1);
		Employee e2 = new Employee(200,"박대리",55000);
		list.add(e2);
		Employee e3 = new Employee(300,"최과장",60000);
		list.add(e3);
		for(Object i: list) System.out.println(i);
	}

}
