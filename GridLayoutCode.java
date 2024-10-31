
import java.awt.GridLayout; // must import for  using GridLayout

import javax.swing.JFrame;

import javax.swing.JButton;

public class GridLayoutCode {

	public static void main(String[] args) { // main method or function
		
		// Layout Manager = Defines the natural layout for components within a container
		// Grid Layout = places components in a grid of cells.Each cell holds same size

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 400);
		// frame.setLayout(new GridLayout(3,1));
		frame.setLayout(new GridLayout(3, 1, 10, 10)); // setting grid layout for the frame
		// new GridLayout(row, column);
		// new GridLayout(row, column, horizontal spacing, vertical spacing);
		// we can use both
		
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		
		
		frame.setVisible(true);
		
		
	}

}
