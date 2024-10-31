import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class FlowLayoutCode {

	public static void main(String[] args) { // main method or function

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 400);
		frame.setLayout(new FlowLayout());
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(250,250));
		panel.setBackground(Color.BLACK);
		panel.setLayout(new FlowLayout()); // Though panels use Flow layout by default
		
		
		panel.add(new JButton("Click Me 01"));
		panel.add(new JButton("Click Me 02"));
		panel.add(new JButton("Click Me 03"));
		panel.add(new JButton("Click Me 04"));
		panel.add(new JButton("Click Me 05"));
		panel.add(new JButton("Click Me 06"));
		panel.add(new JButton("Click Me 07"));
		panel.add(new JButton("Click Me 08"));
		
		frame.add(panel);
		frame.setVisible(true);
		
		
	}

}
