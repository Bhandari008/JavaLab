package slidersPackage;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

class JSlidersEventEx extends JFrame implements ChangeListener {

    private JSlider slider;
    private JPanel panel;

    public JSlidersEventEx() {
        super("Color Changer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);

        slider = new JSlider(JSlider.HORIZONTAL, 0, 255, 127);
        slider.addChangeListener(this);

        panel = new JPanel();
        panel.setBackground(new Color(127, 127, 127));

        add(slider, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        setResizable(true);
        setVisible(true);
    }

    public void stateChanged(ChangeEvent e) {
        int value = slider.getValue();
        panel.setBackground(new Color(value, value, value));
    }

    public static void main(String[] args) {
        new JSlidersEventEx();
    }
}
