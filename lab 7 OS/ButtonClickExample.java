import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonClickExample extends JFrame implements ActionListener {

    private JButton button;

    public ButtonClickExample() {
        // Setting up the frame
        setTitle("Button Click Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Creating the button
        button = new JButton("Click Me");
        button.addActionListener(this); // Registering the button with the ActionListener

        // Adding button to the frame
        add(button);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Displaying a message dialog when the button is clicked
        JOptionPane.showMessageDialog(this, "Button  was Clicked!");
    }

    public static void main(String[] args) {
        new ButtonClickExample();
    }
}

