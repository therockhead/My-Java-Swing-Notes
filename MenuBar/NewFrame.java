import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class NewFrame extends JFrame implements ActionListener{
		
	
	/*
	 * Declaring Menu-Items of File Menu (children)
	 * 
	 * Declared outside of the constructor to make it visible;
	 * to Action Performed Method
	 */
	
		JMenuItem loadItem = new JMenuItem("Load");
		JMenuItem saveItem = new JMenuItem("Save"); 
		JMenuItem exitItem = new JMenuItem("Exit");
	
	NewFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		
		// creating a menu-bar object
		JMenuBar menubar = new JMenuBar();
		
		// declaring menus (parent)
		JMenu filemenu = new JMenu("File");
		JMenu editmenu = new JMenu("Edit");
		JMenu helpmenu = new JMenu("Help");
		
		
/*
 * Adding ActionListener to the menu items		
 */
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		/* keyboard shortcut adder */
		filemenu.setMnemonic(KeyEvent.VK_F); // "Alt-Key+f" for selecting File
		editmenu.setMnemonic(KeyEvent.VK_E); // "Alt-Key+e" for selecting Edit
		helpmenu.setMnemonic(KeyEvent.VK_H); //"Alt-Key+h" for selecting Help
		loadItem.setMnemonic(KeyEvent.VK_L); // l for load
		saveItem.setMnemonic(KeyEvent.VK_S); // s for save
		exitItem.setMnemonic(KeyEvent.VK_E); // e for exit
		
		// adding children or menu items to the "file" menu
		filemenu.add(loadItem);
		filemenu.add(saveItem);
		filemenu.add(exitItem);
		
		// adding menus to the menu-bar
		menubar.add(filemenu);
		menubar.add(editmenu);
		menubar.add(helpmenu);
		
		// setting created MenuBar object as the menu bar of the frame 
		this.setJMenuBar(menubar);
		
		// making the frame visible
		this.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == loadItem) {
		/*	e.getSource() fetches the click */
			System.out.println("You wanna load a file?");
		}
		else if(e.getSource() == saveItem) {
			System.out.println("Saved Successfully");
		}
		else if(e.getSource() == exitItem) {
			System.out.println("Exiting the window......");
			dispose(); // to kill the window
			/*
   			* Or,
      			* System.exit(0);
			*/
		}
		
	}
}
