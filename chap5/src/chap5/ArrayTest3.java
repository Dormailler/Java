package chap5;

import java.util.Arrays;

public class ArrayTest3 {

	public static void main(String[] args) {
		int sample[] = new int[5];
		for(int i = 0 ; i < sample.length; i++) {
			sample[i] = (int)(Math.random() * 100 + 1);
		}
		int sample2[] = new int[10];
		System.arraycopy(sample, 0, sample2, 0, 5);
		System.out.println(Arrays.toString(sample2));
	}

}
