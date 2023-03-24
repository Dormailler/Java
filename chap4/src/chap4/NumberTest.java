package chap4;

public class NumberTest {

	public static void main(String[] args) {
		int su = 67;
		String result = null;
		
		if(su % 3 == 0) {
			if(su % 7 == 0) {
				result = "3의 배수이고 7의 배수이다.";
			}
			else {
				result = "3의 배수이고 7의 배수는 아니다.";
			}
		}
		else {
			result = "3의 배수가 아니다.";
		}
		System.out.println(result);
	}

}
