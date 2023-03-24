package chap13;

class JoinThread extends Thread{
	int i = 1;
	public void run() {
		i = 10;
		System.out.println("run메소드내부=" + i);
	}
}
public class JoinTest{

	public static void main(String[] args) {
			JoinThread j = new JoinThread();	
			j.start();
			try {
				j.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("main메소드내부=" + j.i);
			System.out.println("main메소드종료");

	}

}
