package j_inherit2;

import java.awt.*;

public class Item {
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
	
	public void output() {
		
	}
	
}
