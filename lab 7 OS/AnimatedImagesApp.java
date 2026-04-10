import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.*;

public class AnimatedImagesApp extends JFrame {
    private JPanel panel;
    private JLabel imageLabel, messageLabel;
    private JButton startButton, stopButton;

    private ScheduledExecutorService executor;
    private int x = 50, y = 50;
    private int dx = 5, dy = 0;
    private int step = 0;
    private final int speed = 10; // Milliseconds

    private final String[] messages = { "Welcome", "Enjoy", "Thanks", "Visit Again" };
    private int messageIndex = 0;

    public AnimatedImagesApp() {
        setTitle("Animation of Images");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel(null);
        panel.setBackground(Color.YELLOW);

        imageLabel = new JLabel(new ImageIcon("image.jpg")); // Put your image in the project directory
        imageLabel.setBounds(x, y, 100, 100);

        messageLabel = new JLabel(messages[messageIndex], SwingConstants.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 18));
        messageLabel.setBounds(150, 150, 200, 30);

        startButton = new JButton("Start Animation");
        stopButton = new JButton("Stop Animation");

        startButton.setBounds(150, 300, 120, 30);
        stopButton.setBounds(280, 300, 120, 30);

        panel.add(imageLabel);
        panel.add(messageLabel);
        panel.add(startButton);
        panel.add(stopButton);

        add(panel);

        startButton.addActionListener(e -> startAnimation());
        stopButton.addActionListener(e -> stopAnimation());
    }

    private void startAnimation() {
        if (executor != null && !executor.isShutdown()) return;

        executor = Executors.newScheduledThreadPool(2);

        executor.scheduleAtFixedRate(this::animateImage, 0, speed, TimeUnit.MILLISECONDS);
        executor.scheduleAtFixedRate(this::animateMessage, 0, 1000, TimeUnit.MILLISECONDS); // Message changes every 1 second
    }

    private void animateImage() {
        SwingUtilities.invokeLater(() -> {
            if (step == 0) {
                x += dx;
                if (x >= 350) { step++; dx = 0; dy = 5; }
            } else if (step == 1) {
                y += dy;
                if (y >= 250) { step++; dx = -5; dy = 0; }
            } else if (step == 2) {
                x += dx;
                if (x <= 50) { step++; dx = 0; dy = -5; }
            } else if (step == 3) {
                y += dy;
                if (y <= 50) { step = 0; dx = 5; dy = 0; }
            }

            imageLabel.setBounds(x, y, 100, 100);
            panel.repaint();
        });
    }

    private void animateMessage() {
        SwingUtilities.invokeLater(() -> {
            messageIndex = (messageIndex + 1) % messages.length;
            messageLabel.setText(messages[messageIndex]);
        });
    }

    private void stopAnimation() {
        if (executor != null) {
            executor.shutdownNow();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AnimatedImagesApp().setVisible(true));
    }
}
