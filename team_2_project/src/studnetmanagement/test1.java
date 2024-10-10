package studnetmanagement;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class test1 {
	public static void main(String[] args) {
	
		new test1(); 
		
	Color col = new Color(0);
	JFrame frames = new JFrame();
	
	
	frames.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frames.setPreferredSize(new Dimension(500, 300));
	frames.getContentPane().setBackground(col.BLACK);
	frames.pack();
	frames.setVisible(true);
}
}