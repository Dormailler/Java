package test;

public class PrimeNumberTest {

	public static void main(String[] args) {
		int i = (int)(Math.random() * 100 + 1);
		for(int k = 2; k <= i; k ++) {
			int cnt = 0;
			for(int j = 2; j < k; j++) {
				if(k%j == 0 && k != j) {
					System.out.println(k + "는 소수가 아닙니다." );
					cnt += 1;
					break;
				}
			}
			if(cnt == 0) System.out.println(k + "는 소수입니다." );
		}
	}

}
