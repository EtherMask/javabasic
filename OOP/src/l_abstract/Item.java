package l_abstract;

/*
 * 	abstract(추상) : 미완성
 * 		- method  : overriding의 강제성을 주기위해서
 * 		- class   : 객체생성못함(부모클래스 역할) 
 */

public abstract class Item {
	protected String number;
	protected String title;
	
	public Item() {
		number = "0";
		title = "";
		System.out.println("부모 기본 생성자");
	}
	public Item(String number, String title) {
		this.number = number;
		this.title = title;
		System.out.println("부모 인자 생성자");
	}
	
	 public abstract void output(); 
		//불려질일 없음
	
	
}
