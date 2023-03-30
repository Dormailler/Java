package test;

public class SumTest {

	public static void main(String[] args) {
		int sum = 0;
		int cnt = 0;
		while(true) {
			int num = (int)(Math.random()*100+1);
			
			if(num % 10 == 0) {
				System.out.println(num + "=======> 10의 배수이므로 합계 제외");
				continue;
				}
			sum += num;
			cnt += 1;
			if(sum > 3000) break;
		}
		System.out.println("반복횟수 = " + cnt);
		System.out.println("총합계 = " + sum); 
	}

}
