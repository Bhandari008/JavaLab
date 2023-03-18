package boxesPackage;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JComboBox;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ComboBoxEx extends JFrame{

	
	JComboBox<String> box;
	JList<String> list;
	JLabel bLabel, lLabel;
	public ComboBoxEx() {
		setSize(300, 300);
		
		FlowLayout layout = new FlowLayout();
		
		setLayout(layout);
		String[] clubs = {"Napoli", "Bayern", "Real Madrid", "Chelsea", "Man City"};
		bLabel = new JLabel("Club");
		box = new JComboBox<String>(clubs);
		
		add(box);
		box.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String club = box.getSelectedItem().toString();
				bLabel.setText(club);
				
			}
		});
		
		list = new JList<String>(clubs);

		
		
		add(list);
		add(bLabel);
		setTitle("BOXES");
		setVisible(true);
	}
	public static void main(String[] args) {
		new ComboBoxEx();

	}

}
