package test;

public class Ex2 {

	public static void main(String[] args) {
		int cntOfBooks = 97;
		int cntOfStu = 12;
		String out = cntOfBooks>cntOfStu?"1명의 학생당 : "
		+cntOfBooks/cntOfStu+"권씩 가질 수 있습니다." + 
		"\n남아있는 책은" + cntOfBooks%cntOfStu + "권입니다.":"나눠줄 수 없습니다.";
		System.out.println(out);
	}
}
