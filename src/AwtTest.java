import java.awt.*;
import java.awt.event.*;

public class AwtTest {

	public static void main(String[] args) {
		
		Frame frame = new Frame("awt demoo");
		
        frame.setLayout(new BorderLayout());
     
        Button center = new Button("按鈕");
         
        frame.add(center, BorderLayout.CENTER);
         
        frame.pack();
        frame.setVisible(true);

	}
}

