package c_control;

import java.util.*;

public class Exo5_for_연습 {

	public static void main(String[] args) {


		//		for(int bad=1;bad<=15;bad++) {
		//			System.out.print(bad + " ");
		//			if(bad%5==0) {
		//				System.out.println();
		//			}
		//		}
		Scanner input = new Scanner(System.in);
		System.out.println("문자 하나를 입력하세요 ->");
		char re = input.next().charAt(0);

		if(re >= 'a' & re <= 'z') { //소문자인지 확인하고 a부터 입력한값까지 출력하는과정
			for(char led='a'; led<=re ;led++)
				System.out.print(led);

		}else  if( re >'A' & re < 'Z') { //대문자인지 확인하고 입력한값부터 Z까지 출력하는과정
			for(char led=re;led<='Z';led++) {
				System.out.print(led);
			}
			}else {System.out.print("error");
			}
			}
		}