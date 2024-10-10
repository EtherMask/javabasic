package h_info3;

import javax.swing.*;
import java.awt.*;

public class InfoTest extends JFrame{

	// 0. 멤버변수 선언
	JTextArea ta;
	JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;
	JButton bAdd, bShow, bSelect, bDelete, bCancel, bExit;
	
	
	// 1. 객체 생성
	InfoTest(){
//===============공백======================
		ta		= new JTextArea();

//===============텍스트====================	
		tfName	= new JTextField(15);
		tfId	= new JTextField(15);
		tfTel	= new JTextField(15);
		tfSex	= new JTextField(15);
		tfAge	= new JTextField(15);
		tfHome	= new JTextField(15);
//===============버튼=====================
		bAdd 	= new JButton("Add (alt+a)", new ImageIcon("src/h_info3/imgs/1.PNG"));
		bShow	= new JButton("Show",		 new ImageIcon("src/h_info3/imgs/2.PNG"));
		bSelect = new JButton("Select", 	 new ImageIcon("src/h_info3/imgs/3.PNG"));
		bDelete = new JButton("Delete", 	 new ImageIcon("src/h_info3/imgs/4.PNG"));
		bCancel = new JButton("Cancel", 	 new ImageIcon("src/h_info3/imgs/5.PNG"));
		bExit	= new JButton("Exit",		 new ImageIcon("src/h_info3/imgs/6.PNG"));
		
		// 추가작업
		// bAdd 작업
		bAdd.setPressedIcon (new ImageIcon("src/h_info3/imgs/5.PNG"));
		bAdd.setRolloverIcon(new ImageIcon("src/h_info3/imgs/4.PNG"));
		bAdd.setVerticalTextPosition  (JButton.BOTTOM);
		bAdd.setHorizontalTextPosition(JButton.CENTER);
		bAdd.setMnemonic('a');				// 단축키 지정 명령어 니모닉(m묵음)
		// bShow 작업
		bShow.setPressedIcon(new ImageIcon("src/h_info3/imgs/1.PNG"));
		
	}
	
	// 2. 화면 붙이기 및 출력
	void addLayout() {
		// 아랫쪽(남쪽)
		JPanel pSouth = new JPanel();
		pSouth.setLayout(new GridLayout(1, 6));	//정렬해서 출력
		pSouth.add(bAdd);
		pSouth.add(bShow);
		pSouth.add(bDelete);
		pSouth.add(bCancel);
		pSouth.add(bSelect);
		pSouth.add(bExit);
		
		// 왼쪽(서쪽)
		JPanel pWest = new JPanel();
		pWest.setLayout(new GridLayout(6, 2));
		pWest.add(new JLabel("이름", 
				  new ImageIcon("src/h_info3/imgs/2.PNG"),JLabel.LEFT));//글자 옆에 그림 붙이기
		pWest.add(tfName);
		pWest.add(new JLabel("아이디",
				  new ImageIcon("src/h_info3/imgs/1.PNG"),JLabel.LEFT));
		pWest.add(tfId);
		pWest.add(new JLabel("주민번호",
				  new ImageIcon("src/h_info3/imgs/4.PNg"),JLabel.LEFT));
		pWest.add(tfTel);
		pWest.add(new JLabel("성별"));
		pWest.add(tfSex);
		pWest.add(new JLabel("나이"));
		pWest.add(tfAge);
		pWest.add(new JLabel("집"));
		pWest.add(tfHome);
		
		// 전체 영역
		setLayout(new BorderLayout());
		add(pSouth, BorderLayout.SOUTH);
		add(ta,		BorderLayout.CENTER);
		add(pWest,	BorderLayout.WEST);
		
		// 화면출력
		setBounds(100, 400, 800, 600);// 창 크기 조정
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		InfoTest info = new InfoTest();
		info.addLayout();
	}

}
