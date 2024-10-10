package studnetmanagement;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

public class StudentMain extends JFrame{
	
	StudentView		student;
	
	public StudentMain() {
		
		// StudentView 값 초기화 및 인스턴스 생성
		student	= new StudentView();
	
		// 탭 타이틀 글씨 키우기
        UIManager.put("TabbedPane.font", new Font("돋음", Font.PLAIN, 15)); // 글씨 크기 설정

		// 붙이기
		JTabbedPane pane = new JTabbedPane();
		pane.addTab("학생관리", student);
		
		// 화면 출력
		add(pane, BorderLayout.CENTER);
		setBounds(100, 100, 1200, 800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		new StudentMain();		// StudentMain 인스턴스 생성
	}

}
