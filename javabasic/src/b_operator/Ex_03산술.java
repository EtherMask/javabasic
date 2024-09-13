package b_operator;

import java.util.Scanner;

public class Ex_03산술 {

	
	public static void main(String[] args) {
		
		
	int a = 13;
	
	if( a%2 == 0) {
		System.out.println("짝수");
	}else {
		System.out.println("홀수");
	
		
		Scanner input = new Scanner(System.in);
		
		int ex1, ex2, ex3, ex4, ex5, ex6, ex7;
		System.out.println("첫번째 숫자 입력->");
		ex1 = input.nextInt();
		System.out.println("두번째 숫자 입력->");
		ex2 = input.nextInt();
		System.out.println("더하기 : " + (ex1+ex2));
		System.out.println("첫번째 키 입력");
		ex3 = input.nextInt();
		System.out.println("빼기 : " + (ex1-ex2));
		System.out.println("두번째 키 입력");
		ex4 = input.nextInt();
		System.out.println("곱하기 : " + (ex1*ex2));
		System.out.println("세번째 키 입력");
		ex5 = input.nextInt();
		System.out.println("나누기 : " + (ex1/ex2));
		System.out.println("네번째 키 입력");
		ex6 = input.nextInt();
		System.out.println("퍼센트 : " + (ex1%ex2));
		
	}
	}
}