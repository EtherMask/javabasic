package l_abstract;

import java.util.Scanner;

public class Poly {

	public static void main(String[] args) {

		Item i = null;

		Scanner input = new Scanner(System.in);
		System.out.println("원하는 상품 선택 (1.책  2.DVD 3.CD ) -> ");
		int sel = input.nextInt();

		switch(sel) {
		case 1: i = new Book("001","자바책","ICT","자바쌤"); break;
		case 2: i = new Dvd("002","아바타2","AI","카메론");  break;
		case 3: i = new Cd("003","해바라기도 가끔 목이 아프죠","MC The Max"); break;

		}

		i.output(); //*******

	}

}
