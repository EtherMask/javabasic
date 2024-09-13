package e_method;

public class Ex06_CallByString {

	public static void main(String[] args) {
		String a = "안녕";
		String b = "하이";
		
		add(a, b);
		System.out.println("2. A="+a+", B="+b);
	}
	
	static void add(String a, String b) {		//String = 별종
		a +=b;									//String은 참조형이면서 기본형인척 하고 싶어서 요약 연산자가 가능
		System.out.println("1. A="+a+", B="+b);	//String은 한번이라도 변형되면 메모리를 새로 잡는다
	}

}
