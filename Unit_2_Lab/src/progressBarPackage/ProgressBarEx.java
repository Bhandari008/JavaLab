package progressBarPackage;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class ProgressBarEx extends JFrame {

	JProgressBar bar;
	JButton btn;
	JLabel label;
	public ProgressBarEx() {
		setSize(400, 400);
		setTitle("Progress Bar");
		setLayout(new FlowLayout(20, 10, FlowLayout.CENTER));
		
		
		JButton btn = new JButton("Click to fill water.");
		
		bar = new JProgressBar();
		label = new JLabel("0");
		btn.addActionListener(new ActionListener() {
			int liter = 0;
			public void actionPerformed(ActionEvent e) {
				
				liter = liter + 1;
				bar.setValue(liter);
				label.setText(String.valueOf(liter)+ " ltr water filled");
				
			}
		});
		
		add(btn);
		add(bar);
		add(label);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		new ProgressBarEx();
	}

}
