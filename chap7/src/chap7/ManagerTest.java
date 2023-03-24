package chap7;

class Employee{
	String title="회사원";
	int id;
	String name;
	double pay;
	void work() {
		System.out.println("사번=" + id + " 이름= " + name + " 직급=" + title);
	}
}
class Manager extends Employee{
	String title = "관리직";
	String manageOfJob;
	
	void work() {
		super.work();
		System.out.println("관리직종=" + manageOfJob);
	}
	void test() {
		String title = "로컬";
		System.out.println(title);
		System.out.println(this.title);
		System.out.println(super.title);
	}
	
	
}
public class ManagerTest {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.id = 100;
		m.name= "이자바";
		m.pay = 100000;
		m.manageOfJob = "it";
		System.out.println("사번="+m.id+" 이름="+m.name+" 관리직종="+m.manageOfJob+" 급여="+m.pay);
		System.out.println("관리직종");
		m.work();
		System.out.println(m.title);
		m.test();
	}

}
