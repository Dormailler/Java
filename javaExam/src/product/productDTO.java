package product;

public class productDTO {
	int prdNo;
	String prdName;
	int prdPrice,prdYear;
	String prdMaker;
	
	public productDTO(int prdNo, String prdName, int prdPrice, int prdYear, String prdMaker) {
		super();
		this.prdNo = prdNo;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
		this.prdYear = prdYear;
		this.prdMaker = prdMaker;
	}

	@Override
	public String toString() {
		return prdNo + "\t" + prdName + "\t" + prdPrice + "\t" + prdYear + "\t" + prdMaker;
	}
}
