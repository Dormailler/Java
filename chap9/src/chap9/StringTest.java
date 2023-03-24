package chap9;

class StringTest {
	  public static void main(String[] args) {
		String first = "Arnold";
		String middle = "Alois";
		String last = "Schwarzenegger";
		String initials;
		initials = first.substring(0, 1)+middle.substring(0, 1)+last.substring(0, 1);

		System.out.print("1. 이름: ");
		System.out.println(first + " " + middle + " " + last);
		System.out.print("2. 이름 (대문자): ");
		System.out.println(first.toUpperCase()+ " " +last.toUpperCase());
		System.out.print("3. 이니셜:  ");
		System.out.println(initials);	
				
		System.out.println("4. First Name은 arnold이다. (대소문자 구분; T/F):  " + first.equals("arnold"));
		System.out.println("5. First Name은 arnold이다. (대소문자 미구분; T/F):  " + first.equalsIgnoreCase("arnold"));
			
		System.out.println("6. Last Name " + last + "의 index 번호 6~14까지 문자열 : " +  last.substring(6, 14));
		System.out.println("7. Last Name " + last + "에서 negger 문자열의 위치 : " + last.indexOf("negger"));	
		
		String test1 = "";
		String test2 = null;
		System.out.println(test1.length());
		}
	}

