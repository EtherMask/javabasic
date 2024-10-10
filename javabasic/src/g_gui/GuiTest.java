package g_gui;

/*
 * 	자바의 GUI
 * 
 * 		- AWT 	: 1.2 이전에 사용
 * 		- Swing : 1.2 이후에 사용
 * 			=> J 붙이기
 */

import java.awt.*;
import javax.swing.*;					

//	is a 방식
public class GuiTest extends JFrame{	// 자바는 단일 상속을 기준으로 하기에 부모가 둘인 경우는 불가능

	JButton b1 = null;
	JButton b2 = null;
	JCheckBox game;
	JCheckBox music;
	JTextField tf;						// 한줄 입력받는 명령어
	JTextArea ta;						// 여러줄 입력받는 명령어
	JRadioButton rb_male, rb_female;	// 라디오버튼은 무조건 그룹으로 묶기
	
	//JLabel la;						//굳이 멤버변수를 안잡아도 된다
		
	GuiTest(){
		super("두번째 창");				// 생성자함수를 이용하는방법
		
		b1 = new JButton("OK");
		b2 = new JButton("CANCEL");
		
		game = new JCheckBox("붕괴: 스타레일", true);
		music = new JCheckBox("호랑수월가", true);
		
		tf = new JTextField(25);
		ta = new JTextArea(10, 50);		// 영단어의 평균 50개
		
		rb_male = new JRadioButton("남자", true);
		rb_female = new JRadioButton("여자");
		ButtonGroup bGrp = new ButtonGroup();
		bGrp.add(rb_male);
		bGrp.add(rb_female);
		
		//la = new JLabel("이름입력");		// 객체 생성도 안해도 됨
		
		//==============================================================
		// 화면에 붙이기
		/*
		 * 		*레이아웃 : 화면에 붙이는 스타일
		 * 
		 * 		1.FlowLayout
		 * 			` 윗줄 상단에 한 줄 붙이기
		 * 			` 폭의 크기에 따라 다음 줄에 붙음
		 * 			` 컴포넌트 크기 고정
		 * 		
		 * 		2.GridLayout
		 * 			` 행과 열에 맞춰서 붙임
		 * 			` 컴퍼넌트 크기 변경
		 * 		3.BorderLayout
		 * 			` 정해진 다섯 영역에 붙임
		 * 			` 동, 서, 남, 북, 중앙
		 * 			` 컴포넌트 크기 변경
		 */
		
		//setLayout(new FlowLayout());
		//setLayout(new GridLayout(5, 2));
		setLayout(new BorderLayout());	//5개만 붙일수있음
		
		add(b1, BorderLayout.WEST);	// 버튼
		add(b2, BorderLayout.EAST);
		
		add(game, BorderLayout.NORTH);	// 체크박스
		add(music, BorderLayout.SOUTH);
		
		JPanel p_center = new JPanel();	// BorderLayout을 속이기 위해 사용하는 명령어
		p_center.setLayout(new GridLayout(5, 2));
		p_center.add(rb_male);
		p_center.add(rb_female);
		p_center.add(new JLabel("이름입력"));
		p_center.add(tf);
		add(p_center, BorderLayout.CENTER);
		
//		add(new JLabel("이름입력"), BorderLayout.CENTER);		// 레이블
//		add(tf);						// 텍스트 필드
//		add(new JLabel("메시지 입력"));
//		add(ta);						// 텍스트 에이리어
//		
//		add(rb_male);					// 라디오 버튼
//		add(rb_female);
		
		//================================================================
		// 화면 출력
		setBounds(100, 100, 600, 400);	// 프레임의 위치와 크기 지정
		setVisible(true);				// 프레임에 대한 화면 출력
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 출력된 창에서 x버튼을 눌러 닫을때 프로그램이 종료되도록 하는 명령어
	}
	
	public static void main(String[] args) {
		
		new GuiTest();
	}

}
