package javaProject1;

import java.util.ArrayList;

public class ProductTest {

	public static void main(String[] args) {
		ArrayList<Product> prd = new ArrayList(3);
		Product prd1 = new Product("001","노트북",1200000,2021,"삼성");	
		prd.add(prd1);
		Product prd2 = new Product("002","모니터",300000,2021,"LG");	
		prd.add(prd2);
		Product prd3 = new Product("003","마우스",30000,2020,"로지텍");	
		prd.add(prd3);
		prd.toString();
		System.out.println("상품번호\t상품명\t가격\t연도\t제조사");
		System.out.println("------------------------------------");
		for(Object p:prd) {
			System.out.println(p.toString());
		}
	}

}
