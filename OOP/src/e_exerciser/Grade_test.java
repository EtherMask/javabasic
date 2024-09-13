package e_exerciser;

import java.util.Scanner;

public class Grade_test {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("데이터 개수 크기->");
		int su = in.nextInt();

		int [] ary = new int[su];
		
		System.out.println("정수 데이터입력");
		for(int i=0;i<ary.length;i++) {
			ary[i]=in.nextInt();
		}
		
		GradeExpr grade= new GradeExpr(ary);
		System.out.println("총점:" + grade.getTotal());
		System.out.println("평균:" + grade.getAverage());
		System.out.println("최고 점수:" + grade.getGoodscore());
		System.out.println("최저 점수:" + grade.getBadscore());
	}

}