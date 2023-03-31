package product;

import java.util.ArrayList;


public class ProductTest {

	public static void main(String[] args) {
		ArrayList<productDTO> prd = new ArrayList(3);
		productDTO prd1 = new productDTO(100,"노트북",1200000,2021,"삼성");	
		prd.add(prd1);
		productDTO prd2 = new productDTO(200,"아이패드",500000,2022,"애플");	
		prd.add(prd2);
		productDTO prd3 = new productDTO(300,"마우스",15000,2021,"LG");	
		prd.add(prd3);
		prd.toString();
		System.out.println("상품번호\t상품명\t가격\t제조년도\t제조사");
		System.out.println("======================================");
		for(Object p:prd) {
			System.out.println(p.toString());
		}
		System.out.println("======================================");
	}

}
