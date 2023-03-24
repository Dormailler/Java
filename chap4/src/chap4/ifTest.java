package chap4;

public class ifTest {

	public static void main(String[] args) {
		String name = "남궁성";
		int kor = (int)(Math.random()*100) + 1;
		int eng = (int)(Math.random()*100) + 1;
		int mat = (int)(Math.random()*100) + 1;
		int sum = kor + eng + mat;
		int avgInt = sum / 3;
		double avgDouble = (double)sum / 3;
		
		System.out.println("이름=" + name);
		System.out.println("국어=" + kor);
		System.out.println("영어=" + eng);
		System.out.println("수학=" + mat);
		System.out.println("총점=" + sum);
		System.out.println("정수평균=" + avgInt);
		System.out.println("실수평균=" + avgDouble);
		
		String grade = null;
		if(avgInt >= 80) {
			grade = "A등급";
		}
		else if(avgInt >= 60) {
			grade = "B등급";
		}
		else if(avgInt >= 40) {
			grade = "C등급";
		}
		else{
			grade = "D등급";
		}
		System.out.println(grade);
	}

}
