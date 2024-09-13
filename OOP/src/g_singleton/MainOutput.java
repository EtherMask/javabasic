package g_singleton;

import java.util.Scanner;

public class MainOutput {

	public static void main(String[] args) {
		
		//예금주명 입력
		Scanner input = new Scanner(System.in);
		System.out.println("예금주명을 입력해주세요->");
		String nm = input.next();
		
		//계좌번호 입력
		System.out.println("계좌번호를 입력해주세요->");
		String num = input.next();
		
		//잔액입력
		System.out.println("잔액을 입력해주세요->");
		int number = input.nextInt();
		
		BankInput bk = new BankInput(nm, num, number);
		bk.Print();
		
		//입금금액 입력 및 결과값 출력
		System.out.println("입금할 금액을 입력해주세요->");
		int number1 = input.nextInt();
		bk.inmoney(number1);
		bk.Print();
		
		//출금금액 입력 및 결과값 출력
		System.out.println("출금할 금액을 입력해주세요->");
		int number2 = input.nextInt();
		bk.outmoney(number2);
	}
}