package b_operator;

/*
 *  문자열처리하는 클래스
 * 
 * 		- String
 * 		- StringBuffer / StringBuilder
 */

public class Ex12_Strnig별종 {
	public static void main(String [] args) {
		
		StringBuffer sb = new StringBuffer("기영");
		sb.append("천재");
		System.out.println(sb);
		
		StringBuilder sb2 = new StringBuilder("홍길동");
		sb2.append("바보");
		System.out.println(sb2);
		
		//String str = new String("윤기영");
		// 특권] new 생략가능
		//		+ 연산자 가능
		String str = "윤기영";
		str += "바보";		//str = str + "바보";
		System.out.println(str);
		//스트링클래스는 참조형
		
	}

}
