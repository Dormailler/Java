package chap9;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		int i = (int)(Math.random()*100)+1;
		
		Random ran = new Random();
		int j = ran.nextInt(100); // 1-100
		double k = ran.nextDouble(99.99); //double최대값
		System.out.println(j + ":" + k );
		
	}

}
