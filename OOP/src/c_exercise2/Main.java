package c_exercise2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Product a = null;
		a = new Product();
		Scanner input = new Scanner(System.in);
		
		System.out.println("상품번호를 입력하세요->");
		String str1 = input.next();
		a.setProductNo(str1);
		System.out.println("상품명을 입력하세요->");
		String str2 = input.next();
		a.setProductName(str2);
		System.out.println("초기 재고량을 입력해주세요->");
		int num1 = input.nextInt();
		a.setStock(num1);
		
		System.out.print("판매량을 입력해주세요->");
		int num3 = input.nextInt();
		a.sale(num3);
		a.output();
		
		System.out.print("입고량을 입력해주세요->");
		int num4 = input.nextInt();
		a.income(num4);
		a.output();
	}
}