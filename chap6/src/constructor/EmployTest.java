package constructor;

class Employee{
	Employee(int id, String name, String dept, double pay , String title){
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.pay = pay;
		this.title = title;
	}
	Employee(int id, String name){
		this(id,name,"부서미정",0.0,"직급미정");
	}
	Employee(){
		this(-1,"모름","부서미정",0.0,"직급미정");
	}
	
	int id;
	String name;
	String title;
	String dept;
	double pay;
	void work() {
		System.out.println(title + " 직급을 가지고 " + dept + " 부서에서 일합니다.");
	}
	void calcpay() {
		System.out.println("이달의 급여는 5% 보너스가 추가됩니다. = " + (pay + pay*0.05));
	}
}
public class EmployTest {
	public static void main(String[] args) {
		Employee e1 = new Employee(100,"김사원","it개발부",50000,"사원");
		System.out.printf
		("사원의 사번은 %d , 이름은 %s , 부서는 %s , 직급은 %s , 급여는 %.2f , 입니다. \n",
				e1.id, e1.name, e1.dept, e1.title, e1.pay );

		
		Employee e2 = new Employee(200,"박대리");
		System.out.printf
		("사원의 사번은 %d , 이름은 %s , 부서는 %s , 직급은 %s , 급여는 %.2f , 입니다. \n",
				e2.id, e2.name, e2.dept, e2.title, e2.pay );
		Employee e3 = new Employee();
		System.out.printf
		("사원의 사번은 %d , 이름은 %s , 부서는 %s , 직급은 %s , 급여는 %.2f , 입니다. \n",
				e3.id, e3.name, e3.dept, e3.title, e3.pay );
	}
}	
