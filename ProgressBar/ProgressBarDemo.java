import java.awt.*;
import javax.swing.*;


public class ProgressBarDemo {
	
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar();
	
	ProgressBarDemo(){
		
		bar.setValue(0);
		bar.setBounds(0, 0, 420, 50);
		bar.setStringPainted(true);  
		bar.setFont(new Font("MV Bori", Font.PLAIN, 20));
		bar.setForeground(Color.RED);
		bar.setBackground(Color.black);
		
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
		
	}
	/*
	 * ----From 0 to 100: incremental progress bar----
	  
	public void fill() {
		int counter = 0;
		
		while(counter <= 100) {
			bar.setValue(counter);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter += 5;
		}
		
		bar.setString("DONE");
		
		
	}
	*/
	
	/* ---- Going Backwards---- */
	
	public void fill() {
		int counter = 100;
		
		while(counter >= 0) {
			bar.setValue(counter);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter -= 5;
		}
		
		bar.setString("DEAD");
		
		
	}
	

}
