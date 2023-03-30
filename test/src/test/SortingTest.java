package test;

class Student{
	String name;
	int score ;
}
public class SortingTest {

	public static void main(String[] args) {
		Student[] stu = new Student[args.length];
		for(int i = 0; i< args.length; i++) {
			stu[i] = new Student();
			stu[i].name = args[i];
			stu[i].score = (int)(Math.random()*100+1);
		}
		for(int i = 0; i < args.length; i++) {
			System.out.println("학생이름 : " + stu[i].name + " 점수 : " + stu[i].score);
		}
		for(int i = 0; i < args.length; i++) {
			for(int j = i+1; j < args.length; j++) {
			if(stu[i].score < stu[j].score) {
				Student temp = stu[i];
				stu[i] = stu[j];
				stu[j] = temp;
				
			}
		}
		}
		for(int i = 0; i< args.length; i++) {
			System.out.println("학생이름 : " + stu[i].name + " 점수 : " + stu[i].score + "\t"+ (i+1) + "등");
		}
		

	}

}
