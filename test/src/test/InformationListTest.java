package test;

import java.util.ArrayList;
import java.util.Arrays;

class Information{
	String id;
	String name;
	Information(){}
	Information(String id, String name){
		this.id = id;
		this.name = name;
	}
	String print() {
		return id+":"+name;
	}
}
class Product extends Information {
	int price;
	public Product(String id, String name, int price) {
		super(id,name);
		this.price = price;
	}
	@Override
	String print() {
		return super.print()+":"+price;
	}
	
}
class Board extends Information{
	String contents;
	int viewcount;
	public Board(String id, String name, String contents, int viewcount) {
		super(id,name);
		this.contents = contents;
		this.viewcount = viewcount;
	}
	String print() {
		return super.print()+":"+contents+":"+viewcount;
	}
	
}
class Member1 extends Information{
	String email;
	String phone;
	public Member1(String id, String name, String email, String phone) {
		super(id,name);
		this.email = email;
		this.phone = phone;
	}
	String print() {
		return super.print()+":"+email+":"+phone;
	}
}
public class InformationListTest {

	public static void main(String[] args) {
		ArrayList<Information> list = new ArrayList();
		list.add(new Board("1","게시물1","현재 조회수 10입니다", 10));
		list.add(new Product("100", "멀티컴퓨터", 300000));
		list.add(new Member1("hong","홍길동","hong@a.com","010-222-2222"));
		list.add(new Board("2","게시물2","새로운 게시물 추가합니다", 0));
		list.add(new Product("200", "벤처정수기", 1000000));
		list.add(new Member1("lee","이철수","chul@b.com","010-333-3333"));	
		for(Information o : list) {
			System.out.println(o.print());
		}
		//출력
		/*==================================
				1:게시물1:현재 조회수 10입니다:10
				100:멀티컴퓨터:300000
				hong:홍길동:hong@a.com:010-222-2222
				2:게시물2:새로운 게시물 추가합니다:0
				200:벤처정수기:1000000	
		=================================
	   */
	}

}
