package a_datatype;

public class Ex06_Decalalation {

	public static void main(String[] args) {
	
		/*
		int kor;     //변수선언
		kor = 30;    //값대입
		
		//초기화 = 변수언언+값대입
		int engllish = 30;
		*/
		
		int korean=30, engllish=40; 
		int chm=100, knt=98;
		
		System.out.println("국어" + korean + ", 영어= " + engllish);
		System.out.printf("국어: %d , 영어 = %d\n\n", korean, engllish);
		System.out.printf("화학= %d, 물리= %d\n\n" + chm, knt);
		
		//System.out.println();
		
		/*
		 * 만약에 국어점수와 영어점수가 동일하니
		 * 그렇다면 "두 점수가 동일"이라고 출력
		 * 그렇지않다면 "두 점수는 다름"
		 */
		if(korean == engllish) {
			System.out.println("두 점수가 동일");
		}else {
			System.out.println("두 점수가 다름");
		}
	}

}
