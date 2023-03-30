package test;
//람다식 
class MusicThread extends Thread{

	@Override
	public void run() {
		for(int i = 0; i< 3; i++) System.out.println("음악듣는중입니다.");
	}
	//상속 . 오버라이딩 - 음악듣는중입니다 3번 출력
	
	
}

class DownloadThread extends Thread{
	//상속 . 오버라이딩  - 다운로드중입니다 10번 출력
	public void run() {
		for(int i = 0; i< 10; i++) System.out.println("다운로드중입니다.");
	}
}

class NewsThread extends Thread{
	//상속 . 오버라이딩  - 뉴스보는 중입니다 5번 출력
	public void run() {                                  
		for(int i = 0; i< 5; i++) System.out.println("뉴스보는중입니다.");
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		Thread arr[] = new Thread[3];
		arr[0] = new Thread(new MusicThread());
		arr[1] = new Thread(new NewsThread());
		arr[2] = new Thread(new DownloadThread());
		for(int i = 0 ; i< arr.length; i++)
			arr[i].start();
		
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