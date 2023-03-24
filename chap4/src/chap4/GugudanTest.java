package chap4;

public class GugudanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<= 9; i++) {
			for(int dan = 2; dan <= 9; dan ++) {
				if(dan == 5) break;
				System.out.print(dan + "*" + i + "=" + dan*i + " ");
			}
			System.out.println();
		}
	}

}
