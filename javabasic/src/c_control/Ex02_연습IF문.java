package c_control;

public class Ex02_연습IF문 {
	public static void main(String[] args) {
		
		String uvnum = "2017111001";
		
			// 입학연도 구하기
		String no = uvnum.substring(0, 4);
		char numb = uvnum.charAt(4);
			String unum = "";
			String num2 = uvnum.substring(5, 7);
			String nom = "";
		if( numb = '1') {
			unum = "공대 ";
		
		}
		System.out.println(no + "는" + unum +"학생입니다.");
	}
}