package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex99_야구게임 {

	public static void main(String[] args) {

		int [] bbl = new int[3];

		for(int i=0; i<bbl.length; i++) {
			bbl[i] = (int)(Math.random()*10);
			for(int j=0; j<i ;j++) {
				if(bbl[j] == bbl[i]) {
					i--;
				}
			}	
//			System.out.println(bbl[i] + "/");
		}
		for(int i=0; i<bbl.length; i++) {
			System.out.print(bbl[i] + " ");
		}
		//---------------
		//2. 사용자 입력값 answer 에 각각의 숫자로 저장
		//		[ex] 3 4 5
		System.out.println("숫자 3개를 입력하세요 (예:1 2 3)->");
		Scanner input = new Scanner(System.in);
		String input_str = input.nextLine();
		StringTokenizer st = new StringTokenizer(input_str);


		int []answer = new int[3];

		for(int a=0;a<answer.length;a++) {
			for(int b=0;b<a;b++) {
				answer [a] = Integer.parseInt(st.nextToken());
			}
		}

		//answer 값 출력
		//		for(int i=0; i<answer.length; i++) {
		//			System.out.print(answer[i] + " ");
		//		}
		//------------------------
		// 3. 값비교
		int strike=0, ball=0;
		for(int i=0;i<bbl.length;i++) {
			for(int j=0;j<answer.length;j++) {
				if(bbl[i] == answer[j]) {
					if(i == j) strike++;
					else ball++;
				}
			}
		}
		// 4. 출력
		for(int d=0;d<5;d++) {
			System.out.println("스트라이크:" + strike + "/볼:" + ball);
		}
	}
}