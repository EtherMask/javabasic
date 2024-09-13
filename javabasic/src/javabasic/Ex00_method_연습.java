package javabasic;

import java.util.Scanner;

public class Ex00_method_연습 {

	public static void main(String[] args) {
		input();
		int lod = output(lod);
	}

	/*
	문자 배열에 저장된 문자들을 화면에 출력한다.
	 */
	static void output(int lod) {


	}

	/*
	두 정수와 알파벳 문자 하나를 입력받는다
	[예] 3 4 F
	 */	
	static int input() {
		System.out.println("정수 2개와 알파벳 하나를 입력해주세요->");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		char ch = input.next().charAt(0);

		char [][] wd = makeSquare(a, b, ch);

			int lod = wd.length;
			return lod;
	}

	// 입력받은 첫 번째 정수만큼의 행과 두번째 정수만큼의 문자 배열을 만들어
	//		입력받은 문자를 시작으로 저장한다. 
	/*
	 * 		F	G	H	I
	 * 		J	K	L	M
	 * 		N	O	P	Q
	 */
	static char [][] makeSquare(int a, int b, char ch) {
		char [][]  wd = new char [a][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				wd [i][j] = ch;
				ch++;
			}
		}
		return wd;
	}
}