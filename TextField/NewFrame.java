import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class NewFrame extends JFrame implements ActionListener{
	// extends JFrame = means NewFrame has all the features JFrame have. 
	// implements ActionListener = means the class implements Action Listener Method
	JButton button;
	JTextField textField;
	
	NewFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout()); // using flow_layout
		
		button = new JButton("Submit");
		button.setFocusable(false);
		button.addActionListener(this);
		
		
//**MAIN---TextField
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(300,30)); // dimension set, 
		//Dimension(width, height);
		textField.setFont(new Font("Consolas", Font.BOLD, 20)); //PLAIN, ITALIC etc
		//to set font Font("font_name", Font.style, font_size);
		textField.setForeground(new Color(0x00FF00));
		// setting color for fonts
		textField.setBackground(Color.BLACK);
		// setting color for Background for the textField
		textField.setCaretColor(Color.white);
		// cursor or caret color setting
		textField.setText("username"); 
		// setting text for the text field by default
		textField.setEditable(true);
		// if it is set true, then we can edit within the textField
		// but.. If the value is false, then we can't add or edit... 
		// any text into the textField
		
		
		
		this.add(button);
		this.add(textField);
		this.pack();// adjust to fit the component I add
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
			//textField.getText();
			System.out.println("Hello Ami " + textField.getText()+ ". Tomar nam ki?");
			button.setEnabled(false);// after clicking once the button gets disabled
			textField.setEditable(false);
			// after giving one input the textField gets disabled 
			// so that no input can be given
		}
	}
	
	

}
