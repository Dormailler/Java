package generic2;

import java.util.ArrayList;

class Solid{
	void tellName() {
		System.out.println("고체류");
	}
}
class Wine{
	String kind;
	public Wine(String kind) {
		this.kind = kind;
	}
}
class Apple extends Solid{
	String origin;
	public Apple(String origin) {
		this.origin = origin;
	}
}
class Paper extends Solid{
	String size;
	public Paper(String size) {
		this.size = size;
	}
}
class Box<T extends Solid>{
	T contents;
	Box(T contents){
		this.contents = contents;
	}
	public T getContents() {
		return contents;
	}
	public void setContents(T contents) {
		this.contents = contents;
	}
	
}

public class GenericTest2 {

	public static void main(String[] args) {
		Apple a = new Apple("대구");
		Paper p = new Paper("a4사이즈");
		Wine w = new Wine("로제와인");
		Solid s = new Solid();
		Box<Apple> aBox = new Box<Apple>(a);
		Box<Paper> pBox = new Box<Paper>(p);
		//Box<Wine> wBox = new Box<Wine>(w);
		
		
		System.out.println(aBox.contents.origin);
		System.out.println(pBox.contents.size);
		
		Box<Solid> sBox = new Box<Solid>(s);
		sBox.setContents(a);
		//System.out.println(sBox.contents.origin);
		sBox.setContents(p);
		//System.out.println(sBox.contents.size);
		ArrayList<Solid> list = new ArrayList();
		list.add(a);
		list.add(p);
		
		
	}

}
