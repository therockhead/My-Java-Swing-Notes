import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class LaunchMenu implements ActionListener{
		
		JFrame frame = new JFrame();
		JButton button = new JButton("New Window");
		
		LaunchMenu(){
			
			button.setBounds(100, 160, 200, 40);
			button.setFocusable(false);
			button.addActionListener(this);
			
			frame.add(button);
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(400, 400);
			frame.setLayout(null);
			frame.setVisible(true);
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) { 
				// (e.getSource() == button) returns true when the button is clicked....
				frame.dispose(); // to kill the launch-menu frame...
				NewWindow mywindow = new NewWindow(); 
			// if the condition is true, then it will create a NewWindow Object for displaying new Window
			}
			
		}
	}


