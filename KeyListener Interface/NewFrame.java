import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class NewFrame extends JFrame implements KeyListener{
    JLabel label;
    NewFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        this.add(label);
        this.addKeyListener(this);

        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // when a key is typed, uses KeyChar, char output
        /*
        using switch for every key-typed condition
         */
        switch(e.getKeyChar()){
            case 'a':
                label.setLocation(label.getX()-10, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY()-10);
                break;
            case 's':
                label.setLocation(label.getX(), label.getY()+10);
                break;
            case 'd':
                label.setLocation(label.getX()+10, label.getY());
                break;
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // when a physical key is pressed down, int output

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // whenever a button is released
       // System.out.println("You released key: " + e.getKeyChar());
        /* getKeyChar() returns a char which was released */
       // System.out.println("released code: "+ e.getKeyCode());
        /* getKeyCode() returns an int value (ASCII code) */
        System.out.println();
    }


}