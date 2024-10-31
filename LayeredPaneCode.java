import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;



public class LayeredPaneCode {

	public static void main(String[] args) { // main method or function
		
		// Layout Manager = Defines the natural layout for components within a container
		// Grid Layout = places components in a grid of cells.Each cell holds same size

		// creating labels for layered pane
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.RED);
		label1.setBounds(50, 50, 200, 200);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.GREEN);
		label2.setBounds(100, 100, 200, 200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.BLUE);
		label3.setBounds(150, 150, 200, 200);
		
		
		//Layered Pane Code Starts Here
		JLayeredPane layeredpane = new JLayeredPane();
		layeredpane.setBounds(0, 0, 500, 500);
		//layeredpane.setBounds(x, y, width, height);
		// x = 0, y = 0 means it will start from the top left corner.
		
		// adding labels to the layered pane (Normal Way)
//		layeredpane.add(label1);
//		layeredpane.add(label2);
//		layeredpane.add(label3);
		
		/*
		// adding labels to the layered pane (setting priority KEYWORD)
		layeredpane.add(label1, JLayeredPane.DEFAULT_LAYER);
		layeredpane.add(label2, JLayeredPane.DEFAULT_LAYER);
		layeredpane.add(label3, JLayeredPane.DRAG_LAYER);
		// Default-> Palette -> Modal -> Pop-Up -> Drag
		// Drag will come on top of everything
		// Default will be behind others
		*/
		
		// adding labels to the layered pane (using priority VALUE)
//***	// using Integer.valueOf() which is called using wrapper class
		layeredpane.add(label1, Integer.valueOf(6)); 
		layeredpane.add(label2, Integer.valueOf(7));
		layeredpane.add(label3, Integer.valueOf(4));
		// here, the higher the value, the higher it stays on top
		// the lower the number, the priority gets down and the layer goes down
		// if the value is same for 2 layer, then the layer which comes fast in code stays on top
//*******		// recommended way of setting priorities for the layered pane
		
		
		JFrame frame = new JFrame("JLayeredPane");
		frame.add(layeredpane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 400);
		frame.setLayout(null);
		
		
		
		
		frame.setVisible(true);
		
		
	}

}
