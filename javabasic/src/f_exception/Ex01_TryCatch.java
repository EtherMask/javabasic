package f_exception;

/*
 *	오류
 *		- 에러 : 심각한 오류
 *		- 예외 : 심각하지 않은 오류
 *
 *	예외처리 : 최종적인 목적은 프로그램이 정상적으로 종료
 *		[1] try~catch
 *			
 *			try{
 *				예외가 발생할 여지가 있는 구문
 *			}catch(Exception ex){
 *				예외가 발생한 후에 구문
 *			}finally{
 *				예외관련없이 무조건 실행군
 *			}
 *
 *		[2] 함수 뒤에 throws
 */

public class Ex01_TryCatch {

	public static void main(String[] args) {

		//String [] str = new string[] {};
		String [] str = {"안녕하세요", "올라", "하이"};

		try {
			for(int i=0;i<str.length;i++) {
				System.out.println(str[i]);
			}
			//return;
		}catch(Exception ex) {								//문제가 발생했을때만 이동하는곳
			System.out.println("예외발생:" + ex.getMessage());//에러가 발생한 부분을 캐치가 잡아내서 출력함
		}finally {											//무조건 실행하는것이라서 에러가 발생했든 안했든 작동함
			System.out.println("무조건 실행 구문");
		}

		System.out.println("프로그램 종료");
	}

}
