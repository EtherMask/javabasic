package c_control;

import java.util.Calendar;

public class Ex03_나이구하기 {

	public static void main(String[] args) {
		
		//String id = "011025-3123456";
		String id = "030225-3123456";
		
		String age = id.substring(0,2);  // age= "03"
		int suage = Integer.parseInt(age);  // 문자열 "03" -> int형 03
		
		Calendar cal= Calendar.getInstance();
		int yeon = cal.get(Calendar.YEAR);
		
		int years=0;
		
		//years = 2024 - (1900+ suage) + 1;
		//성별문자가 '3'이거나 '4'라면
		//years = 2024 - (2000+ suage) + 1;
		
		char sa = id.charAt(7);
		if(sa == '1' | sa == '2') {
			years = yeon - (1900+ suage) + 1;
		}else if(sa == '3' | sa == '4');
			years = yeon - (2000+ suage) + 1;
	
		System.out.println("한국나이=" + years);
		}
	}

/*
	wrapper class : 자료형 클래스

	 int	: Integer
	 long	: Long
	 double	: Double
*/