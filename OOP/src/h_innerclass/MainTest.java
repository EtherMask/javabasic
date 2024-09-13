package h_innerclass;

/*
 * 	inner class : 클래스 안에 클래스 (멤버 취급)
 */

class Outer{
	static class Inner{//inner class안에는 멤버취급이라 static을 붙일수있다
		static void najabara() {
			System.out.println("잡아봅시다");
		}
	}
	//권장하지않음
}

public class MainTest {

	public static void main(String[] args) {
/*		Outer o = new Outer();
		Outer.Inner in = o.new Inner();
		in.najabara();*/
		//Outer.Inner in = new Outer.Inner();
		//in.najabara();
		Outer.Inner.najabara();
	}

}
