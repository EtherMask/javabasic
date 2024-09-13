package a_datatype;

/*
 * [주의] string <이걸로 클래명을 지정하면 자바에서 지정한 기능을 안쓰겠다고 하는것과 동일
 * 
 * [데이터 타입 - 자료형]
 * 
 *  1. 기본형
 *  2. 참조형 : 배열, 클래스
 *     ->반드시 new 란 예약어를 통해 메모리 확보를 해야 한다
 *  
 *String은 제공하는 클래스
 */
/*
 *  name 변수의 값과 name1 변수의 값이 같다면 "이름이 같다" 출력
 *  그렇지 않다면 "이름이 다르다"출력
 *  name1이라는 변수는 name과 다른주소에 값이잡히고 new를 붙이면 다른 주소값에다가 이름을 지정한다
 */

public class Ex_07String {

	public static void main(String[] args) {
		
		int age = 21;
		String name;
		name = new String("윤기영");
		
		String name1 = new String("윤기영");
		
		if(name == name1) {
			System.out.println("주소가 같다");
		}else {
			System.out.println("주소가 다르다");
		//문자열값을 비교한다면 클래스에 저장되있고 변수값에다가 .을 붙이고 이퀄스를 사용하면된다
		}
		if(name.equals(name1) ) {
			System.out.println("이름이 같다");
		}else {
			System.out.println("이름이 다르다");
		}
	 
	}

}
