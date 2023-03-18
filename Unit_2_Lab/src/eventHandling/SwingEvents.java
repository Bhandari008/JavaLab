package eventHandling;

import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingEvents{
	
	JLabel label;
	JTextField textField;
	JLabel pLabel;
	JPasswordField passwordField;
	JTextArea area;
	
	public SwingEvents() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		FlowLayout layout = new FlowLayout();
		panel.setLayout(layout);
		
		label = new JLabel("Age");
		textField = new JTextField(20);
		
		pLabel = new JLabel("Password");
		passwordField = new JPasswordField(20);
		area = new JTextArea(8, 40);
		
		textField.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int age = Integer.parseInt(textField.getText());
				String dateOfBirth = String.valueOf(2023-age);
				area.setText(dateOfBirth);
			}
		});
		
		panel.add(label);
		panel.add(textField);
		panel.add(pLabel);
		panel.add(passwordField);
		panel.add(area);
		
		frame.add(panel);
		frame.setTitle("EVENT HANDLING");
		frame.setSize(300, 300);
		
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		
		
		new SwingEvents();
	}

}