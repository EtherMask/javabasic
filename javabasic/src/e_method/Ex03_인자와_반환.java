package e_method;

public class Ex03_인자와_반환 {

	public static void main(String[] args) {
		// data
		int a =10, b = 20;	//변수 지정
		int sum = add(a,b); //반환 값 받은곳
		// 결과
		
		System.out.println("합=" + sum);
	}
	static int add(int a, int b) {
		// 데이터처리
		int sum = a+b;
		return sum;
	}

}
