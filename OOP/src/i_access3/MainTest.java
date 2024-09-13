package i_access3;

import i_access3.sub.Access;//클래스를 복사하다보면 다른애를 참조하는 경우가 발생할수있어서 확인 잘하기

//	Access 클래스와 MainTest 클래스가 다른 패키지 안에 있는 상황
public class MainTest extends Access{
	//	Access 부모클래스, MainTest 자식클래스

	public static void main(String[] args) {
	
		MainTest                                                                                                                                                                                                                                                                                                                                                                                                              acc = new MainTest();//자식클래스를 불러야지 프로텍티드가 접근 가능
		//acc.a = "프라이빗 변경";
		acc.b = "퍼블릭 변경";//<-퍼블릭은 다른 폴더에 있어도 접근가능함
		acc.c = "프로텍티드 변경";
		//acc.d = "디폴트 변경";
		
		acc.output();
	}

}
