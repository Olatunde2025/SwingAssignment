import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Inherit from JFrame to satisfy the inheritance requirement
public class SwingAssignment extends JFrame {

    // Member variables as specified in the assignment brief
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton updateButton;

    // Constructor to set up the GUI components
    public SwingAssignment() {

        // 1. Instantiate JFrame with title and size (800x800)
        frame = new JFrame("Java Swing Assignment");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes app on exit
        frame.setLayout(new BorderLayout());

        // 2. Implement ImageIcon for custom application icon
        ImageIcon appIcon = new ImageIcon(getClass().getResource("/icon.png"));
        frame.setIconImage(appIcon.getImage());

        // 3. Instantiate JPanel
        panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        // 4. Instantiate JLabel with requested text
        label = new JLabel("Welcome to Java Swing First Individual Assignment by 'olatunde Rahman'");
        label.setFont(new Font("Tahoma", Font.BOLD, 14));

        // 5. Interactive Button to fulfill component requirements
        updateButton = new JButton("Change Theme & Text");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change label text and panel background color on click
                label.setText("Text and Background Successfully Updated!");
                panel.setBackground(Color.CYAN);
            }
        });

        // Add label and button to the panel
        panel.add(label);
        panel.add(updateButton);

        // Add panel to the frame
        frame.add(panel, BorderLayout.CENTER);

        // Make frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Run GUI application on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingAssignment();
            }
        });
    }
}
