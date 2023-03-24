package casting;

class Employee{
	int id;
	String name;
	int salary;
	int pay;
	int baseSalary;
	int empFee;
	public Employee(int id, String name, int salary, int pay) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.pay = pay;
	}
	int calctotal(){
		return salary+pay;
	}
}
class Manager extends Employee{
	int managerpay;
	public Manager(int id, String name, int salary, int pay, int managerpay) {
		super(id, name, salary, pay);
		this.managerpay = managerpay;
	}
	public int calctotal() {
		return managerpay+ super.calctotal();
	}
}
class Engineer extends Employee{
	int qualpay;
	int techpay;
	public Engineer(int id, String name, int salary, int pay, int qualpay, int techpay) {
		super(id, name, salary, pay);
		this.qualpay = qualpay;
		this.techpay = techpay;
	}
	protected int calctotal() {
		return qualpay+techpay + super.calctotal();
	}
}
class Secretary extends Employee{
	int secpay;
	public Secretary(int id, String name, int salary, int pay, int secpay) {
		super(id, name, salary, pay);
		this.secpay = secpay;
	}
	int calctotal() {
		return secpay + super.calctotal();
	}
}
public class SalaryTest {

	public static void main(String[] args) {
		Employee e [] = new Employee[4]; 	
		// 1.상속 2.생성자(타입 순서 갯수....) 	
		e[0] = new Employee(1000,"이사원",10000,5000); 	
		e[1] = new Manager(2000,"김간부",20000,10000,10000); 	
		e[2] = new Engineer(3000,"박기술",15000,7500,5000,5000); 
		e[3] = new Secretary(4000,"최비서",15000,7000,10000); 
		for(int i=0;i<e.length;i++) {
			if(e[i] instanceof Engineer) System.out.printf
			("사번: %d 이름: %s 본봉: %d 총급여: %d 기술수당: %d 자격수당: %d\n"
					,e[i].id,e[i].name,e[i].salary,e[i].calctotal(),((Engineer)e[i]).qualpay,((Engineer)e[i]).techpay);
			else System.out.printf
			("사번: %d 이름: %s 본봉: %d 총급여: %d\n",e[i].id,e[i].name,e[i].salary,e[i].calctotal());
		}
		/* 배열 내의 각 객체의          급여계산메소드 호출하고 	사번, 이름, 총급여 출력         
		 * 단, 기술직 사원은 기술수당, 자격수당도 출력 
		 * 사번:이름:본봉:총급여 
		 * 1000:이사원:10000:xxxxx 
		 * 2000:김간부:20000:xxxxx 
		 * 3000:박기술:15000:xxxxx 
		 * 기술직사원의 경우 : 기술수당 자격수당 
		 * 4000:최비서:15000:xxxxx */

	}

}
