package chap12;

class Apple{
	String origin;

	public Apple(String origin) {
		this.origin = origin;
	}
	
}
class Box{
	Object contents;
	Box(Object contents){
		this.contents = contents;
	}
	public Object getContents() {
		return contents;
	}
	public void setContents(Object contents) {
		this.contents = contents;
	}
	
}
class Paper{
	String size;
	public Paper(String size) {
		this.size = size;
	}
	
}
public class NonGenericTest {

	public static void main(String[] args) {
		Apple a = new Apple("대구");
		Paper p = new Paper("a4사이즈");
		Box aBox = new Box(a);
		Box pBox = new Box(p);
		System.out.println(((Apple)aBox.contents).origin);
		System.out.println(((Paper)pBox.contents).size);
			

	}

}
