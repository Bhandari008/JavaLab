package treeTablePackage;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeTableEx extends JFrame {
	JTree tree;
	JTable table;
	JList<String> list;
	
	public TreeTableEx() {
		setSize(400, 400);
		setTitle("Tree and Table");
		setLayout(new FlowLayout(20, 10, FlowLayout.CENTER));
		
	
		// Tree
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Round8");
		DefaultMutableTreeNode comp = new DefaultMutableTreeNode("UCL");
		DefaultMutableTreeNode club1 = new DefaultMutableTreeNode("Napoli");
		DefaultMutableTreeNode club2 = new DefaultMutableTreeNode("Bayern");
		DefaultMutableTreeNode club3 = new DefaultMutableTreeNode("Real Madrid");
		DefaultMutableTreeNode club4 = new DefaultMutableTreeNode("Chelsea");
		
		root.add(comp);
		comp.add(club1);
		comp.add(club2);
		comp.add(club3);
		comp.add(club4);
		
		
		tree = new JTree(root);
		add(tree);
		
		
		// Table
		String[] columns = {"Name", "Titles"};
		String[][] details = {
				{"Napoli", "0"},
				{"Bayern", "5"},
				{"Real Madrid", "15"},
				{"Chelsea","2"},
				{"Man City", "0"}
		};
		table = new JTable(details, columns);
		add(table);
		
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new TreeTableEx();
	}
}
