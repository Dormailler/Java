package chap4;

public class CharacterTest {

	public static void main(String[] args) {
		char alpha = 'a';
		/*
		System.out.println((int)'a'); // 97
		System.out.println((int)'A'); // 65
		System.out.println((int)'z'); // 122
		System.out.println((int)'Z'); // 90
		*/
		System.out.println((int)alpha);
		char result = '1';
		if(alpha >= 97 && alpha <= 122) {
			result = (char)(alpha - 32);
		}
		else if(alpha >= 65 && alpha >= 90) {
			result = (char)(alpha + 32);
		}
		System.out.println(alpha + "의 대소문자 변환 결과는 " + result + "입니다.");
	}

}
