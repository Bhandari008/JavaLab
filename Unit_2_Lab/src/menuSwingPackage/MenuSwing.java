package menuSwingPackage;
import javax.swing.*;
import java.awt.event.*;

class MenuSwing extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu networkMenu, securityMenu;
    private JMenuItem wifiItem, mobileItem, faceLockItem, patternLockItem;

    public MenuSwing() {
        setTitle("Menu Example");
        
        setSize(300, 300);

        menuBar = new JMenuBar();

        networkMenu = new JMenu("Network");
        wifiItem = new JMenuItem("Wifi");
        wifiItem.addActionListener(this);
        mobileItem = new JMenuItem("Mobile Network");
        mobileItem.addActionListener(this);
        networkMenu.add(wifiItem);
        networkMenu.add(mobileItem);

        securityMenu = new JMenu("Security");
        faceLockItem = new JMenuItem("Face Lock");
        faceLockItem.addActionListener(this);
        patternLockItem = new JMenuItem("Pattern Lock");
        patternLockItem.addActionListener(this);
        securityMenu.add(faceLockItem);
        securityMenu.add(patternLockItem);

        menuBar.add(networkMenu);
        menuBar.add(securityMenu);

        setJMenuBar(menuBar);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JMenuItem item = (JMenuItem)e.getSource();
        String text = item.getText();
        JOptionPane.showMessageDialog(this, "You clicked on " + text + " item.");
    }

    public static void main(String[] args) {
        new MenuSwing();
    }
}
