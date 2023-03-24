package chap8;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			System.out.println(i/j);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
//		catch(ArithmeticException e) {
//			System.out.println("0으로 나눌수 없습니다.");
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("2개 이상의 값을 입력하세요.");
//		}
//		catch(NumberFormatException e) {
//			e.printStackTrace();
//			System.out.println("정수 값을 입력하세요.");
//		}
		System.out.println("메인 종료");
	}	

}
