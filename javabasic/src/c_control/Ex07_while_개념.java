package c_control;

import java.util.Scanner;

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
 */

public class Ex07_while_개념 {

	public static void main(String[] args) {

//		int sum = 0;
//		for(int a=1;a<=10;a++) {
//			sum += a;
//		} // end of for - i
//		System.out.println("합:" + sum);
//		int sum = 0;
//		int a=1;
//		while(a<=10) {
//			sum += a;
//			a++;
//		} // end of for - i
//		System.out.println("합:" + sum);
	
		// 단 수를 입력받아 구구단 출력
		Scanner input = new Scanner(System.in);
		System.out.println("단 입력->");
		int dan = input.nextInt();
			//ex 2 + 1 =2
			//
			//	 2 * 9 = 18
		int no=1;
		while(no<=9) {
			System.out.printf("%d * %d = %d \n", dan, no, dan*no);
			no++;
		}
		
	
	}// end of main

}//	end of class