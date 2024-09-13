package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex07_369 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("숫자 하나를 입력하세요");
		int su = input.nextInt();
		
		for(int et=0;et<su;et++) {
			
			for(int ed=0;ed<su-et-1;ed++) {
				System.out.print(' ');
		}
			
		for(int ed=1;ed<=et+1;ed++) {
			System.out.print(ed);
		}
		System.out.println();
	}
}
}	
//		int no=0;
//		for(int i=1;i<=10000;i++) {
//			int su = i;
//
//			while(su!=0) {
//				int na= su%10;
//
//				if(na == 8) {
//					no++;
//
//				}
//				su = su/10;
//			} //while 반복문 끝 
//		} //for 반복문 끝
//		System.out.println(no + "개");
//		
//	}
//}

//import java.util.Scanner;
//import java.util.StringTokenizer;
//===============================================
//		Scanner input = new Scanner(System.in);
//		System.out.println("숫자 입력 (1 2 3 4)->");
//		String str = input.nextLine();
//		
//		StringTokenizer st = new StringTokenizer(str);
//		for(int i=1; i<=50; i++) {
//			int su = i;
//			boolean no = false;
//		
//			while(su!=0) {
//				int na = su%10;
//				
//				if(na==3 | na==6 | na==9) {
//					System.out.print("짝");	
//					no = true;
//				}
//				su = su / 10;
//			}
//			if(!no) System.out.println(i);
//			else System.out.println();
//		}