package generic;

class Apple{
	String origin;

	public Apple(String origin) {
		this.origin = origin;
	}
	
}
class Box<T>{
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
class Paper{
	String size;
	public Paper(String size) {
		this.size = size;
	}
	
}
public class GenericTest2 {

	public static void main(String[] args) {
		Apple a = new Apple("대구");
		Paper p = new Paper("a4사이즈");
		Box<Apple> aBox = new Box(a);
		Box<Paper> pBox = new Box(p);
		System.out.println(aBox.contents.origin);
		System.out.println(pBox.contents.size);
			

	}

}
