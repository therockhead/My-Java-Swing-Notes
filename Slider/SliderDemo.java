import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo implements ChangeListener{
	
	// ChangeListener is an interface here
	
    // objects are declared outside the constructor to make visible	
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	
	SliderDemo(){
		
		frame = new JFrame("Slider Demo");
		
		panel = new JPanel();
		
		label = new JLabel();
		
		/*
		 *----- Creating Slider Object-------
		 * 
		 * JSlider(start, end, initial_tick_point);
		 * 
		 * initial_tick_point = where the tick mark or slider stays
		 * 
		 * setPreferredSize(new Dimension(dimension)); to set the size
		 * 
		 * setPaintTicks(true) to make the ticks visible
		 * 
		 * setMinorTickSpacing(integer value) = minor size ticks distance set
		 * 
		 * setMajorTickSpacing(integer value) = distance between major ticks
		 * 
		 * 
		 */
		slider = new JSlider(0, 100, 50);
		slider.setPreferredSize(new Dimension(480, 300));
		
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		
		slider.setPaintLabels(true);
		slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
		
		label.setFont(new Font("MV Boli", Font.PLAIN, 20));
		
		//---To make it horizontal--- 
		//slider.setOrientation(SwingConstants.HORIZONTAL);
		//---To make it vertical----
		slider.setOrientation(SwingConstants.VERTICAL);
		
		label.setText(slider.getValue() + "°C");
		
		slider.addChangeListener(this);
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		
		frame.setSize(480, 360);
		frame.setVisible(true);
		
		
		
		
		
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText(slider.getValue() + "°C");
		
	}
	
}
