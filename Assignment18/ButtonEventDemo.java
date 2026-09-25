package Assignment18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonEventDemo extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    ButtonEventDemo() {

        button = new JButton("Click Me");
        label = new JLabel("Press the button");

        setLayout(new FlowLayout());

        add(label);
        add(button);

        button.addActionListener(this);

        setTitle("Button Event Handling");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        label.setText("Button Clicked!");
    }

    public static void main(String[] args) {
        new ButtonEventDemo();
    }
}