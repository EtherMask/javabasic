package studnetmanagement;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class Panel extends JFrame{

	static JFrame jf;

	Panel() {
		
		JTextArea ta = new JTextArea(200, 200);
		JPanel panel1 = new JPanel();
		panel1.add(ta);
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		JFrame jf = new JFrame("테스트화면");
		
		Color col = new Color(0);

		JTabbedPane tp = new JTabbedPane();
		tp.setBounds(100, 100, 1200, 800);
		tp.add("테스트1", panel1);
		tp.add("테스트2", panel2);
		tp.add("테스트3", panel3);
		
	
		jf.add(tp);
		jf.setSize(400, 500);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new Panel();
	}
}