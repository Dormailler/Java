package chap5;

public class ArrayTest2 {

	public static void main(String[] args) {
		String names[] = {"홍길동","박한국","김대한","최강산","이강산","권우리","송자바"};
		int score[][] = new int[6][names.length];
		
		int sums [] = new int[names.length];
		int avgs [] = new int[names.length];
		for(int i = 0; i<score.length-1; i++) {
			int sum = 0;
			for(int j = 0; j < score[i].length; j ++ ) {
				sum += score[i][j];
			}
			sums[i] = sum;
			avgs[i] = sum/names.length;
			
			System.out.println(names[i] + " 학생의 총점은 " + sums[i] + ", 평균은 " + avgs[i] + "입니다." );
			
		}
		score[5] = sums; 
		for(int i = 0; i<score.length; i++) {
			for(int j = 0; j < score[i].length; j ++ ) {
				score[i][j] = (int)(Math.random() * 100 + 1);
				System.out.print(score[i][j]+ "\t");
			}
			System.out.println();
		}
		
		
		
	}
}
