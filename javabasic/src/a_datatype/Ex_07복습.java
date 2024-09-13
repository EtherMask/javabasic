package a_datatype;

public class Ex_07복습 {

	public static void main(String[] args) {
		
		// 나이를 저장할 변수를 선언하고 본인의 나이를 대입 후 출력
		int years;
		years = 22;
		
		System.out.println("나이=" + years);
		int broyears;
		broyears = 25;
		System.out.println("형의 나이=" + broyears);
		
		//본인의 키를 소숫점 포함한 데이터로 저장하고 출력
		
		double tall;
		tall = 178.9;
		System.out.println("나의 키는" + tall + "이다");
		
		// 이름 저장할 변수를 선언하고 이름을 대입 후 출력
		char name = '윤';
		char name2= '기';
		char name3= '영';
		
		System.out.println("나의 이름은 " + name + name2 + name3 + "입니다");
		//문자  :char
		//문자열 : string (클래스 -참조형)
		String names = "윤기영";
		System.out.println("이름은 " + names + "입니다");

	}

}
