import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Hello");
	
	NewWindow(){
		label.setBounds(100, 160, 100, 50);
		label.setFont(new Font(null, Font.PLAIN, 25));
		// new Font(font_name, Font.type, size);
		
		frame.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	

}
