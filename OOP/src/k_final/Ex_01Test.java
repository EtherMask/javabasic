package k_final;

/*
 *	 final : - 변경불가(자식 클래스뿐만 아니라 부모 클래스에서도 값 변경이 불가능해짐)
 * 
 * 		- class : 부모클래스 못됨
 * 		- filed : 값변경 막아버림
 * 		- method: overriding을 막아버림
 */
class Parent{
	final String filed = "부모님꺼";
	final void jib() {
		System.out.println("부모님이 만드신 집");
	}
}

class Child extends Parent{
	Child() {
		//filed = "내꺼";
	}
//	void jib() {
//		System.out.println("자식이 빌딩으로 만듬");
//	}
}
public class Ex_01Test {
	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.filed);
		p.jib();
	}

}
