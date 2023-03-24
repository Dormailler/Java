package chap6;

class Person{
	String name;
	int age;
	static String nation = "대한민국";
}
public class PersonTest {

	public static void main(String[] args) {
		System.out.println(Person.nation);
		Person p1 = new Person();
		p1.name = "김한국";
		p1.age = 22;
		//p1.nation = "대한민국";
		System.out.printf("p1 객체의 이름은 %s , 나이는 %d , 국적은 %s 입니다.\n",p1.name,p1.age,p1.nation);
		Person p2 = new Person();
		p2.name = "홍길동";
		p2.age = 19;
		//p2.nation = "대한민국";
		System.out.printf("p2 객체의 이름은 %s , 나이는 %d , 국적은 %s 입니다.\n",p2.name,p2.age,p2.nation);
	}

}
