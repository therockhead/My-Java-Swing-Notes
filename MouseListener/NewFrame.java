import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class NewFrame extends JFrame implements MouseListener{
    JLabel label;
    NewFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);

        // adding mouse listener to the label
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }

    /*
    * Initially, label color is Black
    * when the mouse-pointer was brought over the label, it's blue (mouseEntered)
    * when the mouse was pressed, it's Yellow (mousePressed)
    * when the mouse-released, it's orange (mouseReleased)
    * when the mouse exits from over the label, it turns back to black (mouseExited)
     */


    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        System.out.println("You Clicked the mouse haha");
        //label.setBackground(Color.GREEN);
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        // mouse pressed over a component
        System.out.println("You Pressed the mouse");

        label.setBackground(Color.YELLOW);


    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        label.setBackground(Color.ORANGE);
        System.out.println("Released");

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        // mouse enters a component
        label.setBackground(Color.blue);

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        // mouse exits a component
        label.setBackground(Color.BLACK);
    }
}