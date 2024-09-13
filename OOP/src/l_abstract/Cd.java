package l_abstract;

public class Cd extends Item{

	private String singer;
	
	public Cd() {
		this("0", "제목없음","무명");
	
	}
	public Cd(String number, String title, String singer) {
		super(number, title);
		this.singer = singer;
	}
	
	public void output() {
		System.out.println("곡 번호:" + number);
		System.out.println("곡 제목:"  + title);
		System.out.println("가수:" + singer);
	
	}
}
