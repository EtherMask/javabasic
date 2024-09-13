package c_exercise;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {

		CalculatorExpr call = new CalculatorExpr();

		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 숫자->");
		//cal.num1=input.nextInt();
		call.setNum1(input.nextInt());
		System.out.println("두번째 숫자->");
		call.setNum2(input.nextInt());

		System.out.println("덧셈:" + call.getAddition());
		System.out.println("뺄셈:" + call.getSubtraction());
		System.out.println("곱셈:" + call.getMultiplication());
		System.out.println("나눗셈:" + call.getDivision());
	}
}
