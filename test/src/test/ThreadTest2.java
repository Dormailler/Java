package test;
//람다식 

public class ThreadTest2 {
	public static void main(String[] args) {
		Runnable arr[] = new Runnable[3];
		arr[0] = () -> {for(int i = 0; i< 3; i++) System.out.println("음악듣는중입니다.");};
		arr[1] = () -> {for(int i = 0; i< 3; i++) System.out.println("뉴스보는중입니다.");};
		arr[2] = () -> {for(int i = 0; i< 10; i++) System.out.println("다운로드중입니다.");};
		for(int i = 0 ; i< arr.length; i++)
			new Thread(arr[i]).start();
		
		/*3개 스레드 시작 메소드 호출 */
		/* 음악듣는중입니다
		 * 음악듣는중입니다
		 * 음악듣는중입니다
		 * 다운로드중입니다
		 * 뉴스보는 중입니다
		 * 음악듣는중입니다
		 * 음악듣는중입니다
		 * ....
		 * 
		 *   */
		
		
	}

}

// 2. interface Runnable {void run();}==> 함수형 인터페이스  ==> 람다식 