package f_exception;

public class MyException {

	public static void main(String[] args) {
		//System.exit(0);<-시스템 강제종료여서 파이널리도 작동하지않는다
		try {
			method();
		}catch(Exception ex) {
			System.out.println("에러발생");
		}	
	}
	static void method()throws Exception{
		String [] str = {"Hello", "goodbye", "bonjur"};
		for(int i=0;i<=str.length;i++) {
			System.out.println(str[i]);
		}
	}
}