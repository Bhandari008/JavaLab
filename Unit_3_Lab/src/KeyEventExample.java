import java.awt.*;
import java.awt.event.*;

public class KeyEventExample extends Frame implements KeyListener {
    TextArea textArea;

    public KeyEventExample() {
        setTitle("Key Listener Example");

        // Create a text area for displaying key events
        textArea = new TextArea();
        add(textArea, BorderLayout.CENTER);

        // Register the KeyListener with the text area
        textArea.addKeyListener(this);

        // Set the size of the frame and make it visible
        setSize(400, 300);
        setVisible(true);
    }


    public static void main(String[] args) {
        new KeyEventExample();
    }


	@Override
	public void keyTyped(KeyEvent e) {
        textArea.append("Key Typed: "+ e.getKeyChar() + "\n");
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
        textArea.append("Key Pressed"+ e.getKeyCode() + "\n");
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
        textArea.append("Key Release"+ e.getKeyCode() + "\n");
		
	}
}
