import java.awt.event.*;
import java.io.File;

import javax.swing.*;
import java.awt.*;


public class NewFrame extends JFrame implements ActionListener{
	
	
	JButton button;
	JLabel label;
	Color color;
	
	NewFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Choose");
		button.addActionListener(this);
		
		label = new JLabel();
		label.setBackground(Color.white);
		label.setText("Hello World :3");
		label.setFont(new Font("Consolas", Font.PLAIN, 80));
		label.setOpaque(true);
		
		this.add(button);
		this.add(label);
		
		this.pack();
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			JColorChooser choose = new JColorChooser();
			
			color = JColorChooser.showDialog(null, "Pick a color..", Color.black);
			label.setForeground(color);
			
		}
	}
	
}
