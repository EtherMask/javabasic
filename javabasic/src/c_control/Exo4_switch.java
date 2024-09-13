package c_control;

/*
 * 	분기문 switch
 * 	[주의] break 문장 확인
 * 	[주의] 문자형(char)/정수형(int/long)/문자열(String)
 */
public class Exo4_switch {

	public static void main(String[] args) {
		
		String id = "030225-3155221";
		char chul = id.charAt(8);
		
		String local = "";
		switch(chul) {
		case 0 : local = "서울";	break;
		case 1 : local = "인천/부산";break;
		case 2 : local = "경기";	break;
		case 9  : local = "제주";	break;
		default : local = "한국";
		}
		
		System.out.println("이 번호는 " + local +"의 지역번호 입니다");
		}

	}
/*	주민번호에서 출신지번호가
		0 : 서울
		1 : 인천/부산
		2 : 경기
		9 : 제주
		나머지 : 한국
		
		if(chul=='0') {
			서울
		}else if(chul=='1') {
			인천/부산
		}else if(chul=='2') {
			경기
		}else if(chull=='9') {
			제주
		}
		분기문
*/