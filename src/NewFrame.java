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
	
	JRadioButton pizzabutton;
	JRadioButton hamburgerbutton;
	
	/*
		ImageIcon pizzaIcon;
		ImageIcon hamburgerIcon;
		
		* These are for adding icons to the radio buttons
	*/
	
	NewFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		/*
		 * 
		 * Creating RadioButton objects
		 * 
		 * */
		//  already declared outside----
		pizzabutton = new JRadioButton("Pizza");
		hamburgerbutton = new JRadioButton("Hamburger");
		
		/*
			pizzaIcon = new ImageIcon("File-Path/name");
			hamburgerIcon = new ImageIcon("File-path/name");
			
			*----Finally to set the icons to the buttons---
			* 
			* 	pizzabutton.setIcon(pizzaIcon);
			* 	hamburgerbutton.setIcon(hamburgerIcon);

		*/
		/*
		 * Now we are adding a button group
		 * So that multiple options can't be choose
		 * If we don't make button groups and just add the buttons
		 * only to the frame, then we can choose all the options 
		 */
		ButtonGroup group = new ButtonGroup();
		group.add(hamburgerbutton);
		group.add(pizzabutton);
		// now we can choose one option only
		
		/*
		 * we must add the action listener 
		 * to the radio buttons
		 * otherwise the actionPerformed method won't work
		 */
		
		pizzabutton.addActionListener(this);
		hamburgerbutton.addActionListener(this);
		
	
		// adding radio buttons to the frame
		this.add(pizzabutton);
		this.add(hamburgerbutton);
		
		
		this.pack();
		this.setVisible(true);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == pizzabutton) {
			System.out.println("You Ordered Pizza!!");
		}
		else if(e.getSource() == hamburgerbutton) {
			System.out.println("You ordered Hamburger!!");
		}
		
	}
	
	

}
