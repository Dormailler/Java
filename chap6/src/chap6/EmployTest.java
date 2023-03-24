package chap6;

public class EmployTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.id = 100;
		e1.name = "김사원";
		e1.dept = "it개발부";
		e1.pay = 50000;
		e1.title = "사원";
		System.out.printf
		("사원의 사번은 %d , 이름은 %s , 부서는 %s , 직급은 %s , 급여는 %.2f , 입니다. \n",
				e1.id, e1.name, e1.dept, e1.title, e1.pay );
		Employee e2 = new Employee();
		e2.id = 200;
		e2.name = "박대리";
		e2.dept = "인재개발부";
		e2.pay = 55000;
		e2.title = "대리";
		System.out.printf
		("사원의 사번은 %d , 이름은 %s , 부서는 %s , 직급은 %s , 급여는 %.2f , 입니다. \n",
				e2.id, e2.name, e2.dept, e2.title, e2.pay );
		System.out.printf
		("사원의 사번은 %d , 이름은 %s , 부서는 %s , 직급은 %s , 급여는 %.2f , 입니다. \n",
				e2.id, e2.name, e2.dept, e2.title, e2.pay );
		e1.name = "권도현";
		System.out.printf
		("사원의 사번은 %d , 이름은 %s , 부서는 %s , 직급은 %s , 급여는 %.2f , 입니다. \n",
				e2.id, e2.name, e2.dept, e2.title, e2.pay );
		e1.work();
		e1.calcpay();
		e2.work();
		e2.calcpay();
		
	}

}
class Employee{
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