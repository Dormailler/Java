package chap7;

class NoSingleton{
	NoSingleton(){
		System.out.println("Nosingleton 생성자 호출");
	}
}
class Singleton{ // 객체1개만 생성가능
	private static Singleton s;
	private Singleton(){
		System.out.println("singleton 생성자 호출");
	}
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
		}
		return s;
	}
}
public class SingletonTest {

	public static void main(String[] args) {
		NoSingleton n1 = new NoSingleton();
		NoSingleton n2 = new NoSingleton();
		NoSingleton n3 = new NoSingleton();
		NoSingleton n4 = new NoSingleton();
		Singleton s3 = Singleton.getInstance();
		Singleton s4 = Singleton.getInstance();
		Singleton s5 = Singleton.getInstance();
		Singleton s6 = Singleton.getInstance();
		
	}

}
