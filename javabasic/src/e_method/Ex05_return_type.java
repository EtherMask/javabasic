package e_method;

public class Ex05_return_type {

	public static void main(String[] args) {
		
		int [] data = add();
		int sum = data[0] + data[1];
		System.out.println("합=" + sum);
	}
	static int [] add() {
		int a=10, b=20;
		
		// a, b값을 호출한곳으로 넘긴다면?
		int [] data = {a, b}; //return은 값을 하나만 보낼수있다보니 함수로 묶어서 전송
		
		return data;
	}

}
