package e_method;

/*
 * 	Call By Value
 * 		: 메소드의 인자(파라메터)가 기본형인 경우
 */

public class Ex06_CallByValue {

	public static void main(String[] args) {
		
		int a=10, b=20;
		add(a, b);								//1번째
		System.out.println("2. A="+a+", B="+b);
	}
	static void add(int a, int b) {
		a +=b; // a=a+b;						
		System.out.println("1. A="+a+", B="+b);	//2번째. 그리고 값을 복사해서 이동한것은 돌아갈때 값이 삭제됨
		
	}

}
