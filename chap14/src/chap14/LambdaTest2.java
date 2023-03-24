package chap14;

@FunctionalInterface
interface Calculable{
	int sum(int a,int b);
}
@FunctionalInterface
interface MyFunction{
	public int getValue(int x);
}
@FunctionalInterface
interface GenericInterface<T>{
	public T getValue(T i, T j);
}
public class LambdaTest2 {

	public static void main(String[] args) {
		Calculable calc = null;
		//메소드형태 유추. 리턴타입명시되지않아도 리턴문장
		calc = (int a , int b)->{return a+b;};
		System.out.println(calc.sum(10, 20));
		//매개변수 타입 유추
		calc = (a ,b)->{return a+b;};
		System.out.println(calc.sum(10, 20)); 
		//{}내부에 1문장이고 return 문장이라면 생략가능
		calc = (a ,b)-> a+b ;
		System.out.println(calc.sum(10, 20));
		
		MyFunction mf = null;
		mf = a -> a*a;
		System.out.println(mf.getValue(10));
		
		GenericInterface<String> gi = (s1,s2) -> s1+s2;
		System.out.println(gi.getValue("abc", "def"));
		GenericInterface<Integer> gi1 = (s1,s2) -> s1+s2;
		System.out.println(gi1.getValue(123, 456));
	}

}
