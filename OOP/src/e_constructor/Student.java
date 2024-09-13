package e_constructor;

/*
 * 		[참고] 초기화
 * 
 * 			int a;					//변수선언
 * 			a= 10;					//값지정
 * 
 * 			int b = 20;				//변수선언+값지정 => 초기화
 * 
 * 			int[] array = new int[3];
 * 			array[0] = 100;
 * 			array[1] = 200;
 * 			array[2] = 300;
 * 
 * 			int[] arry2 = {100, 200, 300};	=> 초기화
 * 
 * 		[참고] 클래스 초기화하려면? 생성자함수(Constructor)
 * 
 * 			- 클래스가 인스턴스화 될 때 실행되는 함수이다
 * 			- 생성자함수이름은 반드시 파일클래스명과 동일해야한다
 * 			- 생성자함수는 리턴형이 없음(void도 없음)
 * 			- 생성자함수도 overloading 가능
 * 			-> 메소드명이 동일하고 매개변수(인자)의 타입과 갯수가 다른 여러개의 함수
 * 
 * 			-default constructor :
 * 				` 생성자함수를 한개도 지정 않으면 자동생성
 * 				` 한개라도 지정하면 안만들어줌
 * 
 * 		[참고] 자바 특성
 * 			class Test{					// 클래스명
 * 				String Test;			// 변수명
 * 				public void Test(){ }	// 함수명
 *				public Test () { }		// 생성자
 * 			}
 * 
 * 		[참고] this 와 this()함수
 * 			this :	자기 객체를 지칭하는 레퍼런스
 * 					멤버변수나 멤버메소드를 명확하게 지칭할때
 * 
 * 			this() : 다른 생성자함수를 호출할때
 * 					[주의] 생성자함수로 호출되는 얘는 첫 라인에 기술해야함
 */
public class Student {

	// member fields : 멤버변수들 ( 서로 다른 자료형)
	private String 	name;
	private int 	kor, eng, math;
	private int 	total;
	private double 	avg;


	// ----------------------------
	// 생성자함수 constructor
	public Student() {
//				name = "박길동";
//				kor = 50;
//				eng = 50;
//				math = 50;
//		this("홍길동", 50, 50, 50);			//생성자함수로 호출되는 얘는 첫 라인에 기술해야함 
//		System.out.println("기본생성자 호출");	//나중에 호출이됨
	}
	public Student(String name, int kor, int eng, int math) {
		this.name =	name;
		this.kor = 	kor;
		this.eng = 	eng;
		this.math =	math;
		//System.out.println("인자있는 생성자 호출"); //먼저 호출이됨
	}

	// member methods : 멤버함수들
	public	int calTotal() {
		total = kor + eng + math;
		return total;
	}
	public	double calAvg() {
		avg = (double)total / 3;
		return avg;
	}

	//	setter / getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

}