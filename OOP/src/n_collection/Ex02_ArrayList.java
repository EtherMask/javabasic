package n_collection;

import java.util.ArrayList;
import java.util.Collections;

public class Ex02_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();//데이터 타입을 명확하게 주는것을 제네릭스라고 한다
		list.add("rabbit");
		list.add("cat");
		list.add("dog");
		list.add("fox");
		list.add("ant");
		list.add("bull");
		
		System.out.println(list);
		
		list.set(3, "lion");
		System.out.println(list);
		
		list.add("tiger");
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
//		for(String temp:list) {//향상된 for문. for문 내부에서 집합인 애들을 자동으로 형변환 해준다
//			System.out.println(temp);
//		}
//		
//		for(int i=0;i<list.size();i++) {//오리지널for문
//			String obj = (String)list.get(i);
//			System.out.println(obj);
//		}
		
		
	}

}
