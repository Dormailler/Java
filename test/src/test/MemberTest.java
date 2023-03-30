package test;

class Member{
	String id;
	int password;
	String name;
	int age;
	void insert(String i,int p,String n,int a){
		id = i;
		password = p;
		name = n;
		age = a;
		System.out.println("--------------------------");
		System.out.printf("아이디 : %s \n이름: %s \n나이:%d\n가입 완료되었습니다.\n",id,name,age);
		System.out.println("--------------------------");
	}
	void login(String i,int p) {
		System.out.println("--------------------------");
		if(id.equals(i) && password == p) System.out.println("로그인되었습니다.");
		else System.out.println("로그인 정보를 확인하세요.");
		System.out.println("--------------------------");
	}
	void setPassword(int p) {
		password = p;
		System.out.println("--------------------------");
		System.out.println("암호를 변경하셨습니다.");
		System.out.println("--------------------------");
	}
	void getMyInfo() {
		System.out.println("--------------------------");
		System.out.printf
		("아이디 : %s 회원님 정보는 다음과 같습니다.\n비밀번호: %d \n이름: %s \n나이:%d\n",id,password,name,age);
		System.out.println("--------------------------");
	}
	String logout() {
		System.out.println("--------------------------");
		System.out.println("로그아웃되었습니다.");
		System.out.println("--------------------------");
		id = null;
		password = -1;
		name = null;
		age = -1;
		return id;
	}
}
class MemberTest{
	 public static void main(String args[]){
	  Member mem = new Member();
	  mem.insert("test", 1234, "이자바", 25);
	  mem.login("test", 4321);
	  mem.login("test", 1234);
	  mem.setPassword(1111);
	  mem.getMyInfo();
	  String id  = mem.logout();
	  if(id == null){
	   System.out.println("다시 로그인하셔야 합니다.");
	  }
	 }
}
