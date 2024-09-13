package b_operator;

import java.util.Scanner;

public class Ex00_복습 {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("첫번째 숫자를 입력하세요");
	int no1 = input.nextInt();
	System.out.println("두번째 숫자를 입력하세요");
	int no2 = input.nextInt();
	System.out.println("세번째 숫자를 입력하세요");
	int no3 = input.nextInt();

	int big = (no1>no2)&(no1>no3)?no1:(no3>no2?no3:no2);
	
	int sml = (no2>no1)&(no3>no1)?no1:(no2>no3?no3:no2);
	
	int mid = (no1>no2)?((no1>no3)?((no2>no3)?no2:no3):no1):((no2>no3)?((no1>no3)?no1:no3):no2);
	System.out.println("중간값은: " + mid);
	}
	}