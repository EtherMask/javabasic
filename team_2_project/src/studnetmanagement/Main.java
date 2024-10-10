package studnetmanagement;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
	
	StudentView student;
	
	Main() {
		
		student = new StudentView();
		
		// 화면에 붙이기
		JTabbedPane pane = new JTabbedPane();
		//pane.addTab("학생관리", student);
		
	
		pane.setSelectedIndex(1); // 학생관리를 첫 화면으로 출력되도록 지정
	
		add(pane, BorderLayout.CENTER);
		
		// 화면출력
		setTitle("종합 관리 키오스크");
		setBounds(100, 100, 1200, 800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
	
		new Main();
	}

}
