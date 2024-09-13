package c_exercise2;

public class Product {

	private String productNo;
	private String productName;
	private int stock;
	
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void income(int no1) {
		 stock += no1; 
	}
	
	public void sale(int no2) {
		stock -= no2;
	}
	public void	output() {
		System.out.printf("상품명:%s, 상품번호:%s, 재고량:%d \n", productName, productNo, stock);
	}
	}