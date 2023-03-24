package runnable;

class MyThread1 implements Runnable{
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.print("-");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class MyThread2 implements Runnable{
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.print("|");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
public class ThreadTest1 {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);
		tt1.setPriority(1);
		tt2.setPriority(10);
		System.out.println("tt1의 우선순위="+tt1.getPriority());
		System.out.println("tt2의 우선순위="+tt2.getPriority());
		tt1.start();
		tt2.start();
	}

}
