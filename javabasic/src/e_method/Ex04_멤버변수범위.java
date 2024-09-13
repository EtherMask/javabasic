package e_method;

public class Ex04_멤버변수범위 {

	static int a=10, b=20;
	static int sum; // 멤버 변수는 자동 초기화가 되지만 메인안에서는 자동 초기화가 안된다
	
	public static void main(String[] args) {
		
		
		add();
		System.out.println("합=" + sum);
	}
	
	static void add() {
		sum = a + b;
	}

}
