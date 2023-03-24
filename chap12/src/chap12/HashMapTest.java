package chap12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String[]> phonemap = new HashMap();
		String[] inform1 = {"010-1234-5678","02-111-2222","032-451-3145",
				"hong@a.com","서울시 강남구 역상동"};	
		String[] inform2 = {"010-6516-7344","02-234-5677","034-052-3155",
				"kim@a.com","수원시 영동구 광교동"};	
		String[] inform3 = {"010-1566-5707","03-561-2785","031-761-3731",
				"park@a.com","부산시 해운대구 해운대동"};	
		phonemap.put("홍길동", inform1);
		phonemap.put("김한국", inform2);
		phonemap.put("박대한", inform3);
//		String[] s = (String[])phonemap.get(args[0]);
//		System.out.println(args[0]);
//		System.out.println(Arrays.toString(s));
//		for(String one : s) System.out.println(one);
		// phonemap.put("홍길동", 1);
//		System.out.println(phonemap);
//		System.out.println(phonemap.size());
//		System.out.println(Arrays.toString());
		Set<String> keys = phonemap.keySet();
		for(Object k : keys) {
			System.out.println(k + " 의 정보는 다음과 같습니다.");
			String s[] = phonemap.get(k);
			for(String one : s) System.out.println(one);
			System.out.println("---------------------------------");
		}
		int i[] = {77,12,45,89};
		int j[] = {77,12,45,89};
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));
		System.out.println(Arrays.equals(i, j));
		

	}

}
