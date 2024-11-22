import java.awt.event.*;
import java.io.File;

import javax.swing.*;
import java.awt.*;


public class NewFrame extends JFrame implements ActionListener{
	
	JButton button = new JButton("Load and Select File");
	
	NewFrame(){
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		button.addActionListener(this);
		
		
		this.add(button);
		this.pack();
		this.setVisible(true);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println("Clicked");
			
			JFileChooser filechooser = new JFileChooser();
			
			filechooser.setCurrentDirectory(new File("."));
			
			
		//	int response = filechooser.showOpenDialog(null); // select file to open
			int response = filechooser.showSaveDialog(null); // select file to save
			/*
			 * filechooser.showOpenDialog(null)
			 *
			 * used to select files to open
			 *
			 * returns an integer value which is 0 now as it is null
			 *
			 * so it can be stored in an integer value
			 *
			 * */
			
			if(response == JFileChooser.APPROVE_OPTION){
				File file = new File(filechooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
			

			
		}
	}
	
}
