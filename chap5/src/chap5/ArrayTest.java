package chap5;

public class ArrayTest {

	public static void main(String[] args) {
		String names[] = {"홍","박","김","최","이","권","송"};
		int score[] = new int[names.length];
		for(int i = 0; i<names.length; i++) {
			score[i] = (int)(Math.random()*100+1);
			System.out.println(names[i] + " 학생의 점수 = " + score[i]);
		}
		
		int max= 0;
		String mname = "";
		for(int i = 0; i<names.length; i++) {
			if (score[i] > max) {
				max = score[i];
				mname = names[i];
			}
		}
		System.out.println(mname + "학생의 점수가 " +  max + "이고 1등입니다.");
		
		System.out.println('\u0000');	

	}

}
