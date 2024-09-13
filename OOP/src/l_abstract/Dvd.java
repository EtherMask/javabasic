package l_abstract;

public class Dvd extends Item{

	private String actor;
	private String director;
	
	public Dvd() {
		this("0","제목없음","무명","유명한");
	}
	public Dvd(String number, String title, String actor, String director) {
		super(number, title);
		this.actor = actor;
		this.director = director;
	}
	
	public void output() {
		System.out.println("번호:" + number);
		System.out.println("제목:" + title);
		System.out.println("배우:" + actor);
		System.out.println("감독:" + director);
		
	}
}
