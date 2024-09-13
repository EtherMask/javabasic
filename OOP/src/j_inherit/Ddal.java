package j_inherit;

//***********상속
public class Ddal extends Umma{

	public Ddal() {
		System.out.println("딸 생성");
	}

	//overriding method
	public  void gene() {
		System.out.println("자식은 자식이다");
	}

	public void study() {
		System.out.println("딸은 학생");
	}
}
