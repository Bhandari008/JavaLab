import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class MouseAdapterExample extends MouseAdapter {
    Label label;

    public MouseAdapterExample() {

    	JFrame frame = new JFrame();
        frame.setTitle("Mouse Adapter Example");
        frame.setSize(400, 300);
        frame.setVisible(true);
        // Create a label for displaying mouse events
        label = new Label("No mouse event");

        // Create a MouseAdapter object to handle mouse events
        MouseAdapter mouseAdapter = new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                label.setText("Mouse Clicked at (" + event.getX() + ", " + event.getY() + ")");
            }

            public void mouseEntered(MouseEvent event) {
                label.setText("Mouse Entered at (" + event.getX() + ", " + event.getY() + ")");
            }

            public void mouseExited(MouseEvent event) {
                label.setText("Mouse Exited at (" + event.getX() + ", " + event.getY() + ")");
            }
        };
        frame.add(label, BorderLayout.CENTER);

        // Register the MouseAdapter with the frame
        frame.addMouseListener(mouseAdapter);
        
        // Set the size of the frame and make it visible

    }

    public static void main(String[] args) {
        new MouseAdapterExample();
        
    }
}
