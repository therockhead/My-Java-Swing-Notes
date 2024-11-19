import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


/*------Here NewFrame extends JFrame Means--------
 
 * NewFrame contains all the methods as JFrame
 * NewFrame is a child class/sub-class of JFrame
 * JFrame is the super class or Parent class
 * 
 */

public class NewFrame extends JFrame implements ActionListener{
	
	/*
	 * Why declare outside of the constructor?
	 * 
	 * it's because without declaring outside, the actionPerformed method,
	 * won't recognize the buttons
	 */
	
	JComboBox comboBox;
	
	NewFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		// Options are in the String[]
		String[] food = {"Burger", "Pizza", "Pasta", "Sushi", "Chicken Fry"};
		
		/*
		 * Creating ComboBox object
		 * used string parameter "food" for the options
		 * comboBox.addActionListener(this) adds,
		 * action listener to the comboBox 
		 * so that the actionPerformed method works
		 * 
		 */
		comboBox = new JComboBox(food);
		comboBox.addActionListener(this);
		
		this.add(comboBox);
		
		this.pack();
		this.setVisible(true);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == comboBox) {
				System.out.println(comboBox.getSelectedItem()); 
				// we also can get the index of the selectedItem
				// with comboBox.getSelectedIndex();
		}
		
	}
	
	

}
