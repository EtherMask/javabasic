package h_info2;

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
		tfName	= new JTextField(20);
		tfId	= new JTextField(20);
		tfTel	= new JTextField(20);
		tfSex	= new JTextField(20);
		tfAge	= new JTextField(20);
		tfHome	= new JTextField(20);
//===============버튼=====================
		bAdd 	= new JButton("Add");
		bShow	= new JButton("Show");
		bSelect = new JButton("Select");
		bDelete = new JButton("Delete");
		bCancel = new JButton("Cancel");
		bExit	= new JButton("Exit");
	}
	
	// 2. 화면 붙이기 및 출력
	void addLayout() {
		// 아랫쪽(남쪽)
		JPanel pSouth = new JPanel();
		pSouth.setLayout(new GridLayout(1, 6));
		pSouth.add(bAdd);
		pSouth.add(bShow);
		pSouth.add(bDelete);
		pSouth.add(bCancel);
		pSouth.add(bSelect);
		pSouth.add(bExit);
		
		// 왼쪽(서쪽)
		JPanel pWest = new JPanel();
		pWest.setLayout(new GridLayout(6, 2));
		pWest.add(new JLabel("이름"));
		pWest.add(tfName);
		pWest.add(new JLabel("아이디"));
		pWest.add(tfId);
		pWest.add(new JLabel("전화번호"));
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
		setBounds(100, 100, 800, 600);// 창 크기 조정
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		InfoTest info = new InfoTest();
		info.addLayout();
	}

}
