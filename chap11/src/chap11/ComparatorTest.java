package chap11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTest {

	public static void main(String[] args) {
		
		String[] animals = {"lion","Snake","tiger","dog"};
		Arrays.sort(animals);
		System.out.println(Arrays.toString(animals));
		
		class MyComparator implements Comparator{

			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof String && o2 instanceof String) {
					String s1 = (String)o1;
					String s2 = (String)o2;
					return s1.compareTo(s2) * -1 ;
				}
				return -1;
			}

			
		}
		MyComparator mc = new MyComparator();
		//Arrays.sort(animals,mc);
		Arrays.sort(animals,Comparator.reverseOrder());
		System.out.println(Arrays.toString(animals));
		System.out.println("-------------------------------------");
		Arrays.sort(animals,new Comparator() {
			public int compare(Object o1, Object o2) {
				if(o1 instanceof String && o2 instanceof String) {
					String s1 = (String)o1;
					String s2 = (String)o2;
					return s1.compareTo(s2) * -1 ;
				}
				return -1;
			}
		}
		);
		System.out.println(Arrays.toString(animals));
       
		
	}

}
