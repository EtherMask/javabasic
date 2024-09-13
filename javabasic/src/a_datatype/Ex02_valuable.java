package a_datatype;

public class Ex02_valuable {

	public static void main(String[] args) {
		/*
		 * 참고
		 *  9  : 숫자 9
		 * '9' : 문자 9
		 * "9" : 문자열 9
		 * 
		 */
		//1. 변수선언
		char testCh;     // 문자변수 testCh 선언
		int  jungsu; // *정수형변수 jungsu 선언
		double silsu; // * 실수형변수 sillsu 선언
		boolean ok;   // * 논리형변수 ok 선언
		//2. 값을 지정(저장/대입)
		testCh = '깡';       // tesCh 변수에 '깡' 문자 지정(대입, 저장)
		jungsu = 10000;    // * jungsu 변수에 10000 숫자 지정
		silsu = 3.6;      //선언한 실수형 변수에 3.6 저장
		ok = true;       //선언한 논리형 변수에 ok 저장
		//3. 출력
		System.out.println("문자변수:" + testCh);
		                // * jungsu 변수를 출력
		System.out.println("정수형변수:" + jungsu);
		
		System.out.println("실수형변수:" + silsu);
		
		System.out.println("논리형변수" + ok);
		
	}

}
