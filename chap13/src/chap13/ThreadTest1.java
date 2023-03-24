package chap13;

class MyThread1 extends Thread{
	public void run() {
		for(int i = 1; i<=1000; i++) {
			System.out.print("-");
		}
	}
	
}
class MyThread2 extends Thread{
	public void run() {
		for(int i = 1; i<=1000; i++) {
			System.out.print("|");
		}
	}
}
public class ThreadTest1 {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.start();
		t2.start();
	}

}
