package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex03_Throws {

	public static void main(String[] args) {
		try {
			readFile();		//이 자리에 예외가 다시 터지기에 예외처리를 또 해줘야한다
			System.out.println("파일처리 성공");
		}catch(Exception ex) {
			System.out.println("예외발생:" + ex.getMessage());
			//ex.preintStackTrace();
		}
	}

	static void readFile() throws Exception{
		FileInputStream fis = null;	//파이널리에 변수를 쓰기 위해서 try 바깥에다가 선언하기
		try {
			fis = new FileInputStream("happy.txt");	
		}finally {
			fis.close();
		}
	}
}