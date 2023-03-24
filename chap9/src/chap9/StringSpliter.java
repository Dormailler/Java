package chap9;

public class StringSpliter {

	public static void main(String[] args) {
		String address = "서울시-강남구-역삼동:멀티캠퍼스-13층;2호";
		String[] result =  address.split("(-|;|:| )");
		System.out.println(result.length);
		
		for(int i = 0; i < result.length;i++) {
			System.out.println(result[i]);
		}
		System.out.println("----------------------------");
		
		for(String a : result) {
			System.out.println(a);
		}
	}
}
