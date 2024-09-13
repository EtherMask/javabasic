package b_operator;

/*
 *  비교연산자
 *   > >= < <=  == !=
 */

public class Ex05_비교 {

	public static void main(String[] args) {

		int kor=80, eng=81, math=46;
		// 총점, 평균을 구해서 변수에 저장하고 출력
		
		int total= kor + eng + math;
		double mdl=(double)total / 3;
		System.out.println("총점:" + total);
		System.out.println("평균:" + mdl);
		
	/*학점구하기]
	* 평균이 90점 이상이면 A학점
	* 평균이 80이상 90미만이면 B학점
	* 평균이 70이상 80미만이면 C학점
	*/
		
		
	/*if( mdl >= 90) {                // 만약에 mdl값이 90이상이라면
		System.out.println("A학점"); //   그렇다면 'A'학점 출력
	}else if(mdl >= 80) {           // 그렇지않다면 만약에 mdl값이 80이상이라면
		System.out.println("B학점"); //   그렇다면 'B'학점 출력
	}else if( mdl >= 70) {          //
		System.out.println("C학점");
	}else if( mdl >= 60) {
	}*/
	if( mdl >= 90 ) {	
		System.out.println("A학점");
	}else if( mdl >= 80 ) {
	    System.out.println("B학점");   
	}else if( mdl >= 70 ) {
		System.out.println("C학점");
	}
	/*if( mdl >= 90 ) {	
		System.out.println("A학점");
	}else if( mdl >= 80 ) {
	    System.out.println("B학점");   
	}else if( mdl >= 70 ) {
		System.out.println("C학점");
	*/
	}
}