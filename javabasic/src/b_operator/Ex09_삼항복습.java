package b_operator;

import java.util.Scanner;

public class Ex09_삼항복습 {
	public static void main(String[] args) {
		
		// 두 수 중에서 큰수를 출력
		/*int a = 65, b = 40;
		
		int max;
		if(a > b) {
			max = a;
		}else {
			max = b;
		}
		System.out.println("두 수 중 큰수는 " + max);
		*/
		
		//두 수를 입력받고 그 두 수 중에서 큰 값 출력 ( 삼항연산자 이용 )
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 숫자->");
		int score1 =  input.nextInt();
		System.out.println("두번째 숫자->");
		int score2 = input.nextInt();
		
		int recorde = ( score1>score2 )? score1 : score2 ;
		System.out.println("큰 수는 " + recorde);
	}
}