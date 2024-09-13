package e_method;

/*
 * 	인자 - argument
 * 	매개변수 - parameter
 * 
 * 	인자 := 매개변수
 */
public class Ex01_1인자 extends Ex00_흐름 {
	
	public static void main(String[] args) {
		//	데이터
		int a = 10, b = 20;
		
		add(a,b); // 인자 : argument <-데이터를 넘기는 애
	}
	
	static void add(int a, int b) { // 매개변수 : parameter <-데이터를 받는 애
		//데이터에 대한 처리
		int sum = a + b;
		System.out.println("합:" + sum);
		
	}
}
