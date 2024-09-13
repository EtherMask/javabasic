package b_operator;

import java.util.Scanner;

public class Ex06_복습 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("문자 하나를 입력하세요 ->");
		char ch = input.nextLine().charAt(0);
		System.out.println("문자:" + ch);

		// 사용자가 입력한 문자가 대문자인지 여부 출력
		if( ch >= 'A'  &  ch <= 'Z' ) {  //문자가 'A'보다 크거나 같고, 문자가 'z'보다 작거나 같다면
			System.out.println("대문자");
		}else if( ch >='a' & ch<='z') {
			System.out.println("소문자");
		}else {
			System.out.println("기타 문자");
		if( ch >= 'ㄱ' & ch <= 'ㅎ') {
			System.out.println("한글 초성");
		}else if( ch >= '가' & ch <= '하') {
			System.out.println("한글 단어 하나");
		}
			// 그렇지 않다면
			// '기타 문자'라고 출력

			// 그렇지 않다면 문자가 'a'보다 크거나 같고 그렇지않으면
			//  '소문자'라고 출력
			//Ascii-code
			//  'A' : 65
			//  'B' : 66
			//  'B' > 'A'
		}
	}

}

/*
  자동 임포트 : ctrl + shift + o
*/
