package b_encapsciulation;

public class MainTest {

	public static void main(String[] args) {
		// 클래스변수 선언
		Student s = null;
		// 객체 생성
		s = new Student();

		// 값지정 및 처리
//		s.name = "홍길순";
//		s.kor = 88;
//		s.eng = 77;
//		s.math = 60;
		s.setName("홍길순");
		s.setKor(88);
		s.setEng(77);
		s.setMath(60);
		
		System.out.println(s.getName()+"님 총점:" + s.calTotal());


		//s.total = 300;
		System.out.println(s.getName()+"님 평균:" + s.calAvg());
	}

}
