package l_abstract;

public class Book extends Item{

	/*
	 *  @ this / super
	 *  
	 *  	this  : 자기 객체를 지칭
	 *  	super : 부모 객체를 지칭
	 */
	
	private String publisher;
	private String writer;
	
	public Book() {
		number = "0000";
		title = "제목없음";
		publisher = "미정";
		writer = "무명";
		System.out.println("자식의 기본생성자");
	}
	
	public Book(String number, String title, String publisher, String writer) {
	
		//super.number 	= number	;
		//super.title 	= title		;
		super(number, title);//항상 첫줄에만 써야됨
		this.publisher 	= publisher	;
		this.writer 	= writer	;
		System.out.println("자식의 인자 생성자");
	}
	
	//overriding
	public void output() {
		System.out.println("책 번호:" + number);
		System.out.println("책 제목:" + title);
		System.out.println("출판사:" + publisher);
		System.out.println("작가:" + writer);
		
	}
}
