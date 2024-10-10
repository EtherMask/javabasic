package g_gui;

import java.awt.*;

// Temp2 클래스가 Frame 역할을 할 예정
//	is a 방식
public class Temp2 extends Frame{		// 자바는 단일 상속을 기준으로 하기에 부모가 둘인 경우는 불가능

	Button b1 = null;
	Button b2 = null;
	
	Temp2(){
		super("두번째 창");				// 생성자함수를 이용하는방법
		//setTitle("두번째 창");			// set을 이용하는 방법
		b1 = new Button("OK");
		b2 = new Button("CANCEL");
		
		// 화면에 붙이기
		setLayout(new FlowLayout());
		
		add(b1);
		add(b2);
		
		// 화면 출력
		setBounds(100, 100, 100, 100);	// 프레임의 위치와 크기 지정
		setVisible(true);				// 프레임에 대한 화면 출력
	}
	
	public static void main(String[] args) {
		
		new Temp2();
	}

}
