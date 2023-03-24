package chap7;

abstract class Shape{
	abstract void area();
	abstract void circum();
}
class Rectangle extends Shape{
	int width,height; //가로, 세로
	Rectangle(int w,int h){
		width = w; height = h;
	}
	void area(){
		System.out.println
		("가로 " + width +", 세로 " + height + "인 사각형의 면적 = "+ width*height);
	}
	void circum() {
		System.out.println
		("가로 " + width +", 세로 " + height + "인 사각형의 둘레 = "+ (width+height) * 2);
	}
}
class Circle extends Shape{
	int radius; //반지름
	final double pi = 3.14;
	Circle(int r){
		radius = r;
	}
	void area(){
		System.out.println
		("반지름이 " + radius +"인 원의 면적 = " + radius*radius*pi);
	}
	void circum() {
		System.out.printf
		("반지름이 %d인 원의 둘레 = %.2f" , radius ,radius*2*pi);
	}
	
}
public class ShapeTest {

	public static void main(String[] args) {
		if(args[0].equals("rect")) {
			Rectangle r = new Rectangle(Integer.parseInt(args[1]),Integer.parseInt(args[2]));
			r.area();
			r.circum();
		}
		else if(args[0].equals("circle")) {
			Circle c = new Circle(Integer.parseInt(args[1]));	
			c.area();
			c.circum();
		}
		//rect 5 7 -3개 입력 첫번쨰 
		//"rect" 5 7 - > 가로 5 세로 7인 사각형 객체 생성
		//"circle" 5 -> 반지름이 5인 원 객체 생성
		//원,사각형 모두 면적 둘레구하는 메소드 반드시 호출
		//결과 출력 : 반지름이 5인 원의 면젹 = xxx
		//결과 출력 : 반지름이 5인 원의 둘레 = xxx
		//결과 출력 : 가로 5, 세로 7인 사각형의 면젹 = xxx
		//결과 출력 : 가로 5, 세로 7인 사각형의 둘레 = xxx
		
	}

}
