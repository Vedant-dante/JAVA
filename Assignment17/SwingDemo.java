
package Assignment17;

import javax.swing.*;

public class SwingDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Demo");

        JLabel label = new JLabel("Welcome to Java Swing");
        label.setBounds(80, 50, 200, 30);

        JButton button = new JButton("Click Me");
        button.setBounds(100, 100, 100, 30);

        frame.add(label);
        frame.add(button);

        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
