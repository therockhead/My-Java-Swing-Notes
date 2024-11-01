
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox; // must import for CheckBoxes
import javax.swing.JFrame;

public class NewFrame extends JFrame implements ActionListener{
	// extends JFrame = means NewFrame has all the features JFrame have. 
	// implements ActionListener = means the class implements Action Listener Method
	

	JButton button;
	JCheckBox checkbox;
	//Declared outside to get recognized outside constructor method, too!
	
	
	NewFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout()); // using flow_layout
		
		button = new JButton();
		button.setText("Approve");
		button.addActionListener(this);
		// to add action listener with the button
		button.setFont(new Font("Consolas", Font.PLAIN, 10));
		button.setFocusable(false);
		
//***  //CheckBox code
		checkbox = new JCheckBox();
		checkbox.setText("I am not a robot"); // a text with the textbox
		checkbox.setFocusable(false); // recommended to ignore the checkbox border
		checkbox.setFont(new Font("Consolas", Font.PLAIN, 18));
		checkbox.setForeground(Color.blue);
		
		this.add(button);
		this.add(checkbox); // adding checkbox
		
		this.pack();// adjust to fit the component I add
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == button) {
			System.out.println(checkbox.isSelected());
		}
		
	}
	
	

}
