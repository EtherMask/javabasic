package f_static;

/*
 * 	static	:	공유
 *
 *		` 메모리 단 하나 설정(지정)
 *		` 클래스명 접근 (******)
 */
public class Book {
	
	private static int count;//private 때문에 다른곳에서 지정을 못함
	
	static {
		System.out.println("딱한번");//애매하다 싶음 버리는게 좋다
	}
	public Book() {
		count++;
		System.out.println("책객체생성");
	}
	
	public static int getCount() {
		return count;
	}
}
