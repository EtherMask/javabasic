package e_method;



public class Ex99_복습4 {

	public static void main(String[] args) {
		subtract(10, 8);
		greeting(4);
		loopmethod(5);
	}
	/*
	 *  1. 정수형 데이터(int) 2개를 매개변수로 받아서 뺄셈 연산을 수행하여 결과값을 반환하는
	 *  subtract 메소드를 선언하고, 입력 받은 두 수를 인자로 보내서
	 *  그 메소드를 호출하여 결과값을 출력하는 프로그램을 작성하시오.
	 */
	static int subtract(int a, int b){
		int result = a - b;
		return result;
	}
/*
 * ​
 *	2. 정수형 데이터 1개를 매개변수로 받아서 해당되는 문자열(인사말)을 모니터로 출력하는 
 *	메소드 greeting를 선언하고, 입력 받은 정수형 데이터를 인자로 보내서 그 메소드를 호출합니다.
 *	단, 그 정수 데이터에 따라 다음과 같은 인사말을 출력합니다.
 *	( 1-안녕하세요, 2-굿모닝, 3-올라, 4-곤니치와 )
 */
	static void greeting(int c) {
		switch(c) {
		case 1 : System.out.println("안녕하세요"); break;
		case 2: System.out.println("굿모닝"); break;
		case 3: System.out.println("올라"); break;
		case 4: System.out.println("곰방와"); break;
		default : System.out.println("숫자를 다시 입력해주세요");
		}
	}
	static void loopmethod(int d) {
	
		int i=0;
		while(i<d) {
			i++;
		System.out.println("자바는 맛있다");
		}
	}
}