package e_method;

/*
 *  call by reference
 *  	: 메소드의 인자(파라메터)가 참조형인 경우
 *  
 *  	=> 주소만 복사	
 *  주소를 복사하다보니 원본에 영향을 미쳐서 add의 값이 사라져도 원본은 바뀐값으로 저장이됨
 */
public class Ex06_CallByReference {

	public static void main(String[] args) {
		
		StringBuffer a = new StringBuffer("안녕");
		StringBuffer b = new StringBuffer("하이");
		
		add(a, b);
		System.out.println("2. A="+a+"B="+b);
	}
	
	static void add(StringBuffer a, StringBuffer b) {
		a.append(b);
		System.out.println("1. A="+a+"B="+b);
		
	}
}
