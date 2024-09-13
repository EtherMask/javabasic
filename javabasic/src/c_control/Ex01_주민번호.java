package c_control;

public class Ex01_주민번호 {

	public static void main(String[] args) {
		
		String id = "030225-3234567";
		char sung = id.charAt(7);
		
		String gender = "";
		// 그 문자가 1이거나 3이거나 9라면 '남자' 출력
		// 그 문자가 2이거나 4이거나 0이라면 ' 여자' 출력
		if(sung == '1' | sung == '3' | sung == '9') {
		gender = "남자";
		}else if(sung == '2' | sung == '4' | sung == '0') {
		gender = "여자";		
		}
		
		System.out.println("당신은" + gender +"입니다");
	}

}