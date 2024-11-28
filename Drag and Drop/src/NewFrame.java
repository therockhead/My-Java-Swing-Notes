import javax.swing.JFrame;

public class NewFrame extends JFrame{
	
	DragPanel dragPanel = new DragPanel();
	
	NewFrame(){
		
		this.add(dragPanel);
		
		this.setTitle("Drag and Drop Demo");
		this.setSize(1000, 800);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
