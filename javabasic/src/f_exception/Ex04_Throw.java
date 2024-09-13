package f_exception;

public class Ex04_Throw {

	public static void main(String[] args) {
		try {
			readMessage();
		}catch(Exception ex) {
			System.out.println("실패:" + ex.getMessage());
		}
		System.out.println("프로그램 종료");
	}

	static void readMessage() throws Exception{
		String [] str = {"안녕하세요", "올라", "하이"};
		try {
			for(int i=0;i<str.length;i++) {
				System.out.println(str[i]);
			}
		}catch(Exception ex) {
			//throw new MyException();	//아직까지는 쓸법하진 않고 현재는 쓰로우즈, 트라이~캐치만 사용
		}
	}

}
