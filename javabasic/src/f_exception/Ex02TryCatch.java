package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02TryCatch {

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("abc.txt");
			fis.read();

			System.out.println("파일처리");
		}catch(FileNotFoundException ex) { //큰범위를 항상 앞에다가 적어놓기
			System.out.println("파일이 존재하지 않는 예외발생:" + ex.getMessage());
		}catch(Exception ex) {
			System.out.println("예외발생:" + ex.getMessage());
		}finally {
			try {
			fis.close();
			}catch(Exception ex) {}
		}
	}
}