import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class OptionPaneCode {

	public static void main(String[] args) { // main method or function
		
		
		// JOptionPane = pop up a standard dialog box that prompts users with value
		//				 or informs them of something
		// Los Geht's

//*** FORMAT:  showMessageDialog()---
		//JOptionPane.showMessageDialog(parent-Component, object-message, title, message-type);
//		JOptionPane.showMessageDialog(null, "I will kill you", "title", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "I will kill you", "title", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "I will kill you", "title", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "I will kill you", "title", JOptionPane.ERROR_MESSAGE);
//		JOptionPane.showMessageDialog(null, "I will kill you", "title", JOptionPane.QUESTION_MESSAGE);
//*** FORMAT: showConfirmDialog()....	
		// JOptionPane.showConfirmDialog(Parent-Component, Message, Title, Option-Type);
		//JOptionPane.showConfirmDialog(null, "Do you code?", "title", JOptionPane.YES_NO_CANCEL_OPTION);
		
//*** FORMAT: showInputDialog()
		   // JOptionPane.showInputDialog(Object message);
		// example-
		//JOptionPane.showInputDialog("What is your name?");
		
//*****FORMAT: showOptionDialog()
		
		// JOptionPane.showOptionDialog(parentComponent, message, title, OptionType, messageType, icon, options-array, initialValue)
		
		String[] list = {"Coffee", "Tea"};
		ImageIcon icon = new ImageIcon("emoji.png"); // to load icon
		
		
		
		JOptionPane.showOptionDialog(
				null, 
				"Coffe or Tea?", 
				"Choose wisely", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.WARNING_MESSAGE, 
				icon, 
				list, 
				null);
		
		
//		parentComponent--- determines the Frame in which the dialog is displayed; if null, or if the parentComponent has no Frame, a default Frame is used
//		message--- the Object to display
//		title--- the title string for the dialog
//		optionType---  an integer designating the options available on the dialog: DEFAULT_OPTION, YES_NO_OPTION, YES_NO_CANCEL_OPTION, or OK_CANCEL_OPTION
//		messageType---  an integer designating the kind of message this is, primarily used to determine the icon from the plugg-able Look and Feel: ERROR_MESSAGE, INFORMATION_MESSAGE, WARNING_MESSAGE, QUESTION_MESSAGE, or PLAIN_MESSAGE
//		icon---  the icon to display in the dialog
//		options--- an array of objects indicating the possible choices the user can make; if the objects are components, they are rendered properly; non-String objects are rendered using their toString methods; if this parameter is null, the options are determined by the Look and Feel
//		initialValue--- the object that represents the default selection for the dialog; only meaningful if options is used; can be null
		

	  
		
		
		
	}

}     
