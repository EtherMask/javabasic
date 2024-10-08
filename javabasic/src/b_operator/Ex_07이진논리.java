package b_operator;

public class Ex_07이진논리 {
	public static void main(String[] args) {
		
		int a = 15;		//	00000000 00000000 00000000 00001111
		int b = 10;		//	00000000 00000000 00000000 00001010
		
		int and = a & b;// 00000000 00000000 00000000 00001010
		System.out.println("and=" + and);
		
		int c = 15;		//	00000000 00000000 00000000 00001111
		int d = 10;		//	00000000 00000000 00000000 00001010
		
		int or = c | d; //	00000000 00000000 00000000 00001111
		System.out.println("or=" + or);
		
		int e = 15;		//	00000000 00000000 00000000 00001111
		int f = 10;		//	00000000 00000000 00000000 00001010
		
		int exor = e ^ f;//	00000000 00000000 00000000 00000101
		System.out.println("exor=" + exor);
	}

}

/*	
* 논리연산자(이진=비트)
*
* 
*	A  B		A & B	A | B		A ^ B
*	--------------------------------------
*	0  0		  0		  0			  0
*	0  1		  0		  1			  1
*	1  0          0		  1			  1
*	1  1          1		  1			  0
*/