package b_operator;

import java.util.Scanner;

public class java_number_test {
	public static void main (String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("첫번째 숫자를 입력하세요");
	int A = input.nextInt();
	System.out.println("두번째 숫자를 입력하세요");
	int B = input.nextInt();
	System.out.println("세번째 숫자를 입력하세요");
	int C = input.nextInt();
	
	int max = (A<B? A : C);

	}
		}