package javaProject1;

public class Product {
	int prdPrice,prdYear;
	String prdNo,prdName,prdMaker;
	
	public Product(String prdNo, String prdName, int prdPrice, int prdYear,  String prdMaker) {
		super();
		this.prdNo = prdNo;
		this.prdPrice = prdPrice;
		this.prdYear = prdYear;
		this.prdName = prdName;
		this.prdMaker = prdMaker;
	}

	@Override
	public String toString() {
		return prdNo + "\t" + prdName + "\t" + prdPrice + "\t" + prdYear + "\t" + prdMaker;
	}

}
