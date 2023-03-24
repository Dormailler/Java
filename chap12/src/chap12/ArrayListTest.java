package chap12;

import java.util.ArrayList;

class Employee{
	int id; String name; double pay;
	public Employee(int id, String name, double pay) {
		super();
		this.id = id;
		this.name = name;
		this.pay = pay;
	}
	public String toString() {
		String st = "id : " + id + " name : " +name + " pay : " + pay;
		return st;
}

}
public class ArrayListTest {

	public static void main(String[] args) {
		//ArrayList list = new ArrayList(5);
		ArrayList<Employee> list = new ArrayList<Employee>(5);
		// Employee generic 타입 선언
		
		Employee e1 = new Employee(100,"김사원",50000);
		list.add(e1);
		Employee e2 = new Employee(200,"박대리",55000);
		list.add(e2);
		Employee e3 = new Employee(300,"최과장",60000);
		list.add(e3);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).name);
			System.out.println(list.get(i));
		}
		//for(Object i: list) System.out.println(i);
	}

}
