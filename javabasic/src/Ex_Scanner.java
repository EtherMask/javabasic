import java.util.Scanner;

public class Ex_Scanner {
	
	public static void main(String[] args) {
	/*
	 *  자바에서 콘솔 입력받는 방법
	 *  - java.until.Scanner 클래스 이용
	 *  
	 *  -정수형입력시 : nextInt()
	 *  -실수형입력시 : nextDouble()
	 *  -문자열입력시 : next() / nextLine() <숙제
	 * 
	 */
		//참고]자주사용하는 기본적인 클래스는 java.lang 패키지
		//import
		
		int kor, eng, math;
		
		Scanner input = new Scanner(System.in);
		System.out.println("국어입력->");
		kor = input.nextInt();
		
		System.out.println("국어:" + kor);
		//영어점수 입력받기, 수학점수입력받기, 출력
		System.out.println("영어입력->");
		eng = input.nextInt();
		System.out.println("영어:" + eng);
		
		System.out.println("수학입력->");
		math = input.nextInt();
		System.out.println("수학:" + math);
		
		
	int total = math + eng + kor;
		System.out.println("총점" + total);
		double mdl = total / 3;
		System.out.println("평균" + mdl);
 
	}

}
