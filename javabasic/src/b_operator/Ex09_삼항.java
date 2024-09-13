package b_operator;

public class Ex09_삼항 {
	public static void main(String[] args) {
		
		// 점수가 80점보다 크면 '합격'이라고 저장하고 아니면 '불합격'이라고 저장
		
		int score = 85;
		String result;
		
		if( score > 80) {
			result = "합격";
		}else {
			result = "불합격";
		}
		System.out.println("당신은 " + result );
		
		String result2 = (score > 80)? "합격" : "불합격" ;
		System.out.println("당신은 " +result2 );
		
	}
	
}