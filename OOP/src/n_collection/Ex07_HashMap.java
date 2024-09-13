package n_collection;

import java.util.*;

public class Ex07_HashMap {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		HashMap<String, String> map = new HashMap<>();
		//		아이디 비밀번호
		map.put("javassem", "1111");//키값이 동일하면 나중에 실행되는게 이전걸 덮어버림
		map.put("javababo","9999");
		map.put("kimjava","9999");
		map.put("javassem", "1234");

		while(true) {
			System.out.println("아이디를 입력->");
			String id = input.nextLine();
			System.out.println("비빌번호 입력->");
			String pw = input.nextLine();

			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 성공"); break;
				}else {
					System.out.println("비밀번호 불일치"); 
					continue;
				}
			}else {
				System.out.println("존재하지 않는 아이디");
				continue;
			}
			// 구현부분
		}
	}
}