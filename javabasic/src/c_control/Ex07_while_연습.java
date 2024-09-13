package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex07_while_연습 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("숫자 입력 (1 2 3 4)->");
		String str = input.nextLine(); // "1 2 3 4"
		
		StringTokenizer st = new StringTokenizer(str);
		
// 			[문제2] 홀수/짝수의 갯수
		
		int rail=0, train=0;
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			int su = Integer.parseInt(token); // String ->선택
			if( su%2 == 0) train++;
			else rail++;
		}
		System.out.println("짝수 " + train + "개");
		System.out.println("홀수 " + rail  + "개");
	
	
	
	}

}
