package chap4;

public class MonthTest {

	public static void main(String[] args) {
		int month = (int)(Math.random() * 12) + 1;
		int day = 0;
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		default : 
			day = 28;
		}
		System.out.println(month + "월은 " + day + "일까지 있습니다.");
		
		
	}

}
