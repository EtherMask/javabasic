package f_static;

public class Main {

	public static void main(String[] args) {
		//static이 없으면 jvm이 계속 Main m = new Main(); 
		//m.main으로 계속 부르다보니 static을 단것 
		
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
//		
//		System.out.println("책 갯수:" + b1.count);
//		System.out.println("책 갯수:" + b2.count);
//		System.out.println("책 갯수:" + b3.count);
		
		System.out.println("책 갯수:" + Book.getCount());
		//이 상태에선 일반함수여서 class로 접근할수가 없기에 static을 넣은 후 접근해야한다
	}
	
}
