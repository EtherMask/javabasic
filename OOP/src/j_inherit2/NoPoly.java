package j_inherit2;

import java.util.Scanner;

public class NoPoly {

	public static void main(String[] args) {
		
		Book b = null;
		Dvd  d = null;
		Cd   c = null;

		
		Scanner input = new Scanner(System.in);
		System.out.println("원하는 상품 선택 (1.책  2.DVD 3.CD ) -> ");
		int sel = input.nextInt();
		
		switch(sel) {
		case 1: b = new Book("001","자바책","ICT","자바쌤"); break;
		case 2: d = new Dvd("002","아바타2","AI","카메론");  break;
		case 3: c = new Cd("003","해바라기도 가끔 목이 아프죠","MC The Max"); break;
		
		}
		
		switch(sel) {
		case 1: b.output(); break;
		case 2: d.output(); break;
		case 3: c.output(); break;
		}
		
	}

}