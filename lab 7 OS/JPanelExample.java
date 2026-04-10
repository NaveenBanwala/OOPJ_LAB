// import java.awt.event.*;
// import java.awt.*;
// import javax.swing.*;

// class Swing3 extends JFrame implements ActionListener {
//     static JFrame f;
//     static JButton b;
//     static JLabel l;
//     static JTextArea jt;

//     Swing3() { }

//     public static void main(String[] args) {
//         // Create a new JFrame
//         f = new JFrame("TextField Example");

//         // Create a JLabel
//         l = new JLabel("Nothing entered");

//         // Create a JButton
//         b = new JButton("Submit");

//         // Create an instance of Swing3
//         Swing3 te = new Swing3();

//         // Add an ActionListener to the button
//         b.addActionListener(te);

//         // Create a JTextArea
//         jt = new JTextArea(10, 10);

//         // Create a JPanel to organize components
//         JPanel p = new JPanel();
//         p.add(jt);
//         p.add(b);
//         p.add(l);

//         // Add the panel to the frame
//         f.add(p);

//         // Set frame properties
//         f.setSize(300, 300);
//         f.setVisible(true);
//         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }

//     // Handle button action
//     public void actionPerformed(ActionEvent e) {
//         String s = e.getActionCommand();
//         if (s.equals("Submit")) {
//             l.setText(jt.getText()); // Set the label text to the text from the text area
//         }
//     }
// }
import javax.swing.*;
import java.awt.*;

public class JPanelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPanel Example");

        // Create a panel and set its layout
        JPanel panel = new JPanel();
        // panel.setLayout(new FlowLayout());

        // Add components to the panel
        panel.add(new JLabel("Enter your name:"));
        panel.add(new JTextField(10));
        panel.add(new JButton("Submit"));

        // Add the panel to the frame
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}