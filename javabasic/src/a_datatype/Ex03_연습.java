package a_datatype;

public class Ex03_연습 {

	public static void main(String[] args) {

		//국어점수 변수 선언
		//영어점수 변수 선언
		
		//국어점수 변수에 90점 선언
		//영어점수 변수에 100점 선언
		
		//총점 변수 선언
		//총점 계산하기
		
		//총점 출력
		
		int koreanscore;
		int englishscore;
		int totalscore;
		int score;
		int mathscore;
		int Scienscescore;
		int sportsscore;
		
		sportsscore = 77;
		koreanscore = 91;
		englishscore = 100;
		mathscore = 92;
		Scienscescore = 100;
		totalscore = Scienscescore + mathscore + koreanscore + englishscore + sportsscore;
		score = totalscore / 5;
		
		System.out.println("최종점수" + totalscore);
		System.out.println("평균점수" + score);
		
		}

}
