package chap11;

import java.util.HashSet;
import java.util.Random;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(100);
		set.add(225);
		set.add(3);
		set.add(44);
		set.add(55);
		set.add("77");
		for(Object o:set) System.out.println(o);
		
		//1-45 난수 6개 생성하여 lottoset 이름의 HashSet 객체 저장
		HashSet lottoset = new HashSet(6);
		Random ran = new Random();
		while(lottoset.size() < 6) {
			lottoset.add(ran.nextInt(1,45));
		}
		System.out.println(lottoset);
	}

}
