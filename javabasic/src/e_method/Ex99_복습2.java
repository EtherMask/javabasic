package e_method;

import java.util.Scanner;

public class Ex99_복습2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("점수입력->");
		int score = input.nextInt();			//입력감지

		String result = pass(score);			//함수선언함으로써 밑에있는 함수로 이동
		System.out.println("결과:" + result);		//결과값 출력
	}
	
	/*
	 * 	역할	: 입력받은 점수를 넘겨받아서 80점 이상이면 '합격' 출력
	 * 		  그렇지 않으면 '불합격' 출력
	 *
	 */
	static String pass(int score) {
		String result = "";
		if(score >= 80) result = "합격";
		else result = "불합격";


		//System.out.println(result);
		return result;
	}
}