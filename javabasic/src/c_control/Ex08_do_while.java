package c_control;
/*
 * 		반복문
 * 		- for문
 * 		- while문
 * 		- do~ while문
 * 		for(초기치;조건문;증가치) {
 * 			반복문장;
 * 		}
 * 		초기치;
 * 		while(조건문) {
 * 			반복문장;
 * 			증가치;
 * 		}
 * 
 * 		초기치;
 * 		do{
 * 			반복문장;
 * 			증가치;
 * 		}while(조건문);
 */

import java.util.Scanner;

public class Ex08_do_while {
	public static void main(String[] args) {
		
		
//		int sum = 0;
//		int a=1;
//		do{
//			sum += a;
//			a++;
//		}while(a<=10);
//		System.out.println("합:" + sum);
		
		// 단 수를 입력받아 구구단 출력 (do~while 구문)
		
		Scanner input = new Scanner(System.in);
		System.out.println("단 입력->");
		int dan = input.nextInt();

		int no=1;
		do{
			System.out.printf("%d * %d = %d \n", dan, no, dan*no);
			no++;
		}while(no<=9);
	}

}