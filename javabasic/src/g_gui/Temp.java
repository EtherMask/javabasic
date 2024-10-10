package g_gui;

//	AWT : JDK 1.2 이전에 GUI
import java.awt.*;

public class Temp {
	// have a 방식
	Frame f		= null;
	Button b1	= null;
	Button b2 	= null;
	
	Temp() {
		// 객체 생성
		f = new Frame("첫번째 창");
		b1 = new Button("OK");
		b2 = new Button("CANCEL");
		
		// 화면에 붙이기
		// 레이아웃: 컴포넌트를 붙이는 스타일
		f.setLayout(new FlowLayout());		//변수선언을 줄여가지고 set명령어종류 안에다가 넣기
		
		f.add(b1);		// 프레임에 버튼 붙이기
		f.add(b2);		// 화면에 붙이는애들을 컨테이너라고함
		
		// 화면 출력
		f.setBounds(100, 100, 600, 400);	// 프레임의 위치와 크기 지정
		f.setVisible(true);					// 프레임에 대한 화면 출력
	}

	public static void main(String[] args) {
		
		Temp t = new Temp();
		
	}

}
