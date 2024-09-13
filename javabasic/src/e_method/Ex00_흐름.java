package e_method;

public class Ex00_흐름 {

	static  void method() {
		System.out.println("method 실행");
	}
		
	public static void main(String[] args) {
		
		System.out.println("main 시작");//여기가 1번
		method(); //자바의 메인 함수 앞에는 스태틱이 붙어있고 자바는 스태틱이 안붙어있음 못찾는다
		//불렀을때 실행하고 다시 넘어오는게 함수
		System.out.println("main 끝");//여기가 3번
	}//메소드가 있으면 위치에 상관없이 흐름이 정해져있다
}