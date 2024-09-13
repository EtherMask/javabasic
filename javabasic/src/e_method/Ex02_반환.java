package e_method;

/*
 * 함수가 끝나기 전에 함수를 끝내려고 할 때 : return
 * 
 * return 할 때 단 하나의 값을 반환가능
 */
public class Ex02_반환 {

	public static void main(String[] args) {
		
		int sum = add();
		System.out.println("합=" + sum);
	}
	static int add() {
		// 데이터
		int a=10, b=20;
		int sum = a + b;
		return sum; //return은 함수를 끝내고싶지 않을때 쓰는것이며 값을 딱 하나만 가져갈수있다
		//void는 원래 반환하는값이 없어서 쓰던것
	}
}
