package chap7;

class Account{
	String id;
	private int password;
	double balance;
	Account(String id,int password,double balance){
		this.id = id;
		this.password = password;
		this.balance = balance;
	}
	public void changePassword(){
		password = 4321;
	}
}

public class AccounTest {

	public static void main(String[] args) {
		Account acc = new Account("1234-5678",1234,0);
		acc.balance = acc.balance + 1000;
		//acc.balance = acc.balance - 1000;
		//acc.password = 1;
		acc.changePassword();
	}

}
class ProductValue{
	private int code;
	private String title;
	private int price;
	private int balance;
	public void setCode(int code) {
		this.code = code;
	}
	public int getcode() {
		return code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getCode() {
		return code;
	}
}
