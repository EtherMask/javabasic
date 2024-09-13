package b_operator;

public class Ex_07이진논리_연습 {
	public static void main(String[] args) {
		
		int a = 15;
		int b = 10;
		int and = a & b;
		System.out.println("and=" + and);
		
		int or = a | b;
		System.out.println("or=" + or);
		
		int exor = a ^ b;
		System.out.println("exor=" + exor);
	/*
	 * 		논리연산자(이진법=비트)
	 *
	 *		A	B		A & B		A | B		A ^ B
	 *		--------------------------------------------
	 *		0	0		  0			  0			  0
	 *		0	1		  0			  1			  1
	 *		1	0		  0			  1			  1
	 *		1	1		  1			  1			  0
	 */
	}

}
