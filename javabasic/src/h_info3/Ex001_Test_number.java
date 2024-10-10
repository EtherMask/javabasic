package h_info3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex001_Test_number extends JFrame{

	JTextField input;
	double num1;
	String operator;
	
	public Ex001_Test_number() {
		setTitle("계산기");
		setSize(200, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		input = new JTextField();
		add(input, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5, 3));
		
		String[] buttons = {
				"1", "2", "3",
				"4", "5", "6",
				"7", "8", "9",
				"+", "0", "=",
				"-", "*", "/"
		};
		
		 for (String text : buttons) {
	            JButton button = new JButton(text);
	            button.addActionListener(new ButtonClickListener());
	            panel.add(button);
	        }

	        add(panel, BorderLayout.CENTER);
	    }

	    private class ButtonClickListener implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            String command = e.getActionCommand();

	            if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
	                input.setText(input.getText() + command);
	            } else if (command.charAt(0) == '=') {
	                if (operator.isEmpty()) return;
	                double num2 = Double.parseDouble(input.getText());
	                double result = 0;

	                switch (operator) {
	                    case "+":
	                        result = num1 + num2;
	                        break;
	                    case "-":
	                        result = num1 - num2;
	                        break;
	                    case "*":
	                        result = num1 * num2;
	                        break;
	                    case "/":
	                        if (num2 != 0) {
	                            result = num1 / num2;
	                        } else {
	                            input.setText("0으로 나눌 수 없습니다.");
	                            return;
	                        }
	                        break;
	                }

	                input.setText(String.valueOf(result));
	                operator = "";
	            } else {
	                if (!operator.isEmpty()) return;
	                operator = command;
	                num1 = Double.parseDouble(input.getText());
	                input.setText("");
	            }
	        }
	    }

	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(() -> {
			
		Ex001_Test_number test = new Ex001_Test_number();
		test.setVisible(true);
	});
}
}
