import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Inherits from JFrame (satisfies inheritance requirement)
public class SwingAssignment extends JFrame {

    // Member variables
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton updateButton;

    // Constructor (satisfies constructor requirement)
    public SwingAssignment() {

        // 1. Instantiate JFrame (20 Marks)
        frame = new JFrame("Java Swing Assignment");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // 2. Implement ImageIcon (10 Marks)
        ImageIcon appIcon = new ImageIcon("icon.png");
        frame.setIconImage(appIcon.getImage());

        // 3. Instantiate JPanel (20 Marks)
        panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        // 4. Instantiate JLabel (20 Marks)
        // Note: Replace 'Your Name' with your actual full name
        label = new JLabel("Welcome to Java Swing First Individual Assignment by 'Olatunde Rahman'");
        label.setFont(new Font("Tahoma", Font.BOLD, 14));

        // 5. Interactive Button (Changes background & text)
        updateButton = new JButton("Change Theme & Text");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Text and Background Successfully Updated!");
                panel.setBackground(Color.CYAN);
            }
        });

        // Add components to panel
        panel.add(label);
        panel.add(updateButton);

        // Add panel to frame
        frame.add(panel, BorderLayout.CENTER);

        // Display frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingAssignment();
            }
        });
    }
}