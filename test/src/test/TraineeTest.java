package test;

class Trainee{
	String name,course;
	static String academy = "Multicampus";
	int edufee,plusfee,reffee;
	
	void calcreffee(String course,int edufee,int plusfee) {
		if(course.equals("자바")) {
			reffee = (int)(edufee * 0.2) + plusfee;
		}
		else if(course.equalsIgnoreCase("jsp")){
			reffee = (int)(edufee * 0.15) + plusfee;
		}
		else if(course.equalsIgnoreCase("spring")){
			reffee = (int)(edufee * 0.1) + plusfee;
		}
		else {
			System.out.println("일치하는 과정명은 없습니다.");
		}
	}
	public Trainee(String name,String course, int edufee, int plusfee) {
		this.name = name;
		this.course = course;
		this.edufee =edufee;
		this.plusfee = plusfee;
	}
}
public class TraineeTest {

	public static void main(String[] args) {
		Trainee a = new Trainee(args[0],args[1],Integer.parseInt(args[2]),Integer.parseInt(args[3]));
		a.calcreffee(a.course,a.edufee,a.plusfee);
		System.out.println(a.name + "교육생은 " + a.course + " 과정 수강하고\n교육비는 " + a.edufee 
				+ " 부가금은 "+ a.plusfee +" 결제했고\n최종적인 환급금은 " + a.reffee +" 입니다.");
		System.out.println("모든 교육생의 교육기관은 " + Trainee.academy + "입니다");
	}

}
