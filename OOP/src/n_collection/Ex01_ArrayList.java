package n_collection;

import java.util.ArrayList;
import java.util.*;

public class Ex01_ArrayList {

	public static void main(String[] args) {

		List result = method();
		// 처리
		for(int i=0;i<result.size();i++) {
			Object obj = result.get(i);
			System.out.println(obj);
		}
	}

	static List method() {
		// 데이터
		String name = "홍길자";
		Integer age = 100; //int, java 1.5이후부턴 int랑 Integer랑 호환이 되지만 1.5 밑이면 호환이 안된다
		Double height = 182.9;

		List list = new ArrayList();
		// Object [] obj = new Object[갯수]
		list.add(name);
		list.add(age);
		list.add(height);

		return list;
	}

}
