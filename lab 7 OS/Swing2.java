// import javax.swing.*;
// import java.awt.*;

// public class swingExample extends JFrame {

//     public swingExample() {
//         // Setting the title of the JFrame
//         setTitle("Swing Component Example");

//         // Setting layout for the frame
//         setLayout(new FlowLayout());

//         // Creating Components (JButton and JLabel) - Subclasses of JComponent
//         JButton button = new JButton("Click Me");
//         JLabel label = new JLabel("This is a JLabel");

//         // Adding components to the Container (JFrame)
//         add(button);
//         add(label);

//         // JFrame properties
//         setSize(300, 200);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setVisible(true);
//     }

//     public static void main(String[] args) {
//         new swingExample();
//     }
// }
// import javax.swing.*;
// import java.awt.event.*;

// public class ButtonExample {
//     public static void main(String[] args) {
//         JFrame frame = new JFrame("Button Example");
//         JLabel label = new JLabel("Hello Welcome to Swing");
//         label.setBounds(50, 50, 200, 20);
//         label.setToolTipText("This is the Text");

//         JButton button = new JButton("Click Me!");
//         button.setBounds(50, 100, 95, 30);

//             // Create a final copy of 'i' for the ActionListener


//             button.addActionListener(new ActionListener() {
//                 @Override
//                 public void actionPerformed(ActionEvent e) {
//                     label.setText("Welcome to KIIT DU " );
    
//                 }
//             });

//         // Adding components to the frame
//         frame.add(button);
//         frame.add(label);
//         frame.setSize(300, 200);
//         frame.setLayout(null);
//         frame.setVisible(true);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
// }
// import javax.swing.*;
// import java.awt.event.*;

// public class Swing2 {
//     public static void main(String[] args) {
//         JFrame frame = new JFrame("Button Example");

//         // Creating text fields for input
//         JTextField tf1 = new JTextField("Hover Me");
//         tf1.setBounds(20, 20, 100, 20);
//         JTextField tf2 = new JTextField();
//         tf2.setBounds(120, 20, 100, 20);

//         // Creating a label to display the result
//         JLabel label = new JLabel("jjkk");
//         label.setBounds(50, 50, 150, 20);
//         label.setToolTipText("This is a label");

//         // Creating a button to perform the sum
//         JButton button = new JButton("Sum");
//         button.setBounds(50, 100, 95, 30);

//         // Adding an ActionListener to the button
//         button.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 int num1 = Integer.parseInt(tf1.getText());
//                 int num2 = Integer.parseInt(tf2.getText());
//                 label.setText("Sum = " + (num1 + num2));
//             }
//         });

//         // Adding components to the frame
//         frame.add(tf1);
//         frame.add(tf2);
//         frame.add(button);
//         frame.add(label);

//         // Setting up the frame
//         frame.setSize(400, 400);
//         frame.setLayout(null);
//         frame.setVisible(true);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
// }
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class Swing3 extends JFrame implements ActionListener {
    static JFrame f;
    static JButton b;
    static JLabel l;
    static JTextArea jt;

    Swing3() { }

    public static void main(String[] args) {
        // Create a new JFrame
        f = new JFrame("TextField Example");

        // Create a JLabel
        l = new JLabel("Nothing entered");

        // Create a JButton
        b = new JButton("Submit");

        // Create an instance of Swing3
        Swing3 te = new Swing3();

        // Add an ActionListener to the button
        b.addActionListener(te);

        // Create a JTextArea
        jt = new JTextArea(10, 10);

        // Create a JPanel to organize components
        JPanel p = new JPanel();
        p.add(jt);
        p.add(b);
        p.add(l);

        // Add the panel to the frame
        f.add(p);

        // Set frame properties
        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Handle button action
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("Submit")) {
            l.setText(jt.getText()); // Set the label text to the text from the text area
        }
    }
}