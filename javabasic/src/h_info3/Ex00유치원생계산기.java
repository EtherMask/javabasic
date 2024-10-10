package h_info3;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Ex00유치원생계산기 extends JFrame{

	// 멤버변수 선언
	JTextField tfEtr;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, 
	b9, b10, b11, b12, b13, b14, b15;
	
	// 객체생성
	Ex00유치원생계산기(){
		//출력하는곳========
		tfEtr	= new JTextField(20);
		//===============버튼=========
		b1	= new JButton("1");
		b2	= new JButton("2");
		b3	= new JButton("3");
		b4	= new JButton("4");
		b5	= new JButton("5");
		b6	= new JButton("6");
		b7	= new JButton("7");
		b8	= new JButton("8");
		b9	= new JButton("9");
		b10	= new JButton("+");
		b11	= new JButton("0");
		b12	= new JButton("=");
		b13	= new JButton("-");
		b14	= new JButton("*");
		b15	= new JButton("/");
	}
	
	// 화면 붙이기 및 출력
	void addLayOut() {
		
		// 위쪽(북쪽)
		JPanel pNorth = new JPanel();
		pNorth.add(tfEtr);
		
		// 왼쪽(서쪽)=======
		JPanel pWest = new JPanel();
		pWest.setLayout(new GridLayout(5, 3));
		pWest.add(b1);
		pWest.add(b4);
		pWest.add(b7);
		pWest.add(b10);
		pWest.add(b13);
		
		// 가운데(중앙)=============
		JPanel pCenter = new JPanel();
		pCenter.setLayout(new GridLayout(5, 3));
		pCenter.add(b2);
		pCenter.add(b5);
		pCenter.add(b8);
		pCenter.add(b11);
		pCenter.add(b14);
		
		// 오른쪽(동쪽)
		JPanel pEast = new JPanel();
		pEast.setLayout(new GridLayout(5, 3));
		pEast.add(b3);
		pEast.add(b6);
		pEast.add(b9);
		pEast.add(b12);
		pEast.add(b15);
		
		// 전체 영역
		setLayout(new BorderLayout());
		add(pWest,	 BorderLayout.WEST);
		add(pCenter, BorderLayout.CENTER);
		add(pEast,	 BorderLayout.EAST);
		add(pNorth,	 BorderLayout.NORTH);
		// 화면출력
		setSize(200, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Ex00유치원생계산기 ex = new Ex00유치원생계산기();
		ex.addLayOut();
		
	}

}
