package c_control;

public class Ex01_전화번호 {
	public static void main(String[] args) {
		
		String tel = "011-2223-2422";
		int idx = tel.indexOf('-');
			//System.out.println(idx);
		
		String city = "";
		String localNum = tel.substring(0, idx); //0번째부터 idx(2) 앞에까지의 문자열
		//System.out.println(localNum);
		if( localNum.equals("02")) {
			city = "서울";
		System.out.println(city + "입니다");
		}else {
		if(localNum.equals("032")) {
			city = "인천";
		System.out.println(city + "입니다");
		}else {
		if(localNum.equals("0505")) {
			city = "가상번호";
		System.out.println(city + "입니다");
		}else {
		if(localNum.equals("010")) {
			city = "개인번호";
		System.out.println(city + "입니다");
		}else { city = "한국";
			System.out.println(city + "입니다");
		}
		}
		}
		}
	}
}
	
	
	




/*
	02-222-2222
	032-123-1234
	051-555-9876
*/