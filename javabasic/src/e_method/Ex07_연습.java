package e_method;

import java.util.Scanner;

public class Ex07_연습 {

	public static void main(String[] args) {

		int [] score = input();
		double avg = calculate(score);
		output(avg);
	}

	//국, 영, 수 점수를 입력받기
	static int [] input() {

		int [] score = new int[3];

		Scanner in = new Scanner(System.in);
		System.out.println("국어점수->");
		score[0] = in.nextInt();
		System.out.println("영어점수->");
		score[1] = in.nextInt();
		System.out.println("수학점수->");
		score[2] = in.nextInt();

		return score;
	}

	// 입력받은 점수들로 총점 및 평균 구해서 출력
	static double calculate(int [] score) {
		int total = 0;
		double avg = 0.0;

		for(int i=0;i<score.length;i++) {
			total += score[i];

		}

		avg = total / (double)3;
		System.out.println("총점:" + total + ", 평균:" + avg);

		return avg;
	}

	// 평균값을 받아서 학점을 구하여 출력
	static void output(double avg) {
		switch((int)avg/10) {
		case 10:
		case 9: System.out.println("A학점"); break;
		case 8: System.out.println("B학점"); break;
		case 7: System.out.println("C학점"); break;
		case 6: System.out.println("D학점"); break;
		default : System.out.println("F학점");
		}
	}
}
