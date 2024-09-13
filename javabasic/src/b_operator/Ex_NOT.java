package b_operator;

/*
 *  not : 결과에 반대로 하는 연산자
 *  
 *  - 일반논리 (true/false) not : !
 *  - 이진논리 not : ~
 */

public class Ex_NOT {

	public static void main(String[] args) {
		
		// 일반논리 not
		boolean metal = 3 > 4;
		System.out.println(metal);
		System.out.println(!metal);
		
		// 이진논리 not
		int a = 15;     // 000000000 000000000 000000000 000001111
		                // 0:양수, 1:음수
		
		System.out.println(a);
		System.out.println(~a);
		                //  [1] 11111111 11111111 11111111 11110000

	}

}
