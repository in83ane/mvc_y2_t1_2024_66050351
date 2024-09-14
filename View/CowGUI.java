// package View;
// import java.awt.event.ActionListener;
// import javax.swing.*;

// public class CowGUI {
//     private JTextField cowIdField;
//     private JButton searchButton;
//     private JButton clearButton; // Keep the clear button
//     private JLabel resultLabel;
//     private JLabel currentCowLabel;
//     private JPanel panel;
//     private JFrame frame;

//     public CowGUI() {
//         frame = new JFrame("Cow Information");
//         frame.setSize(500, 200); // Adjusted size to remove excess space
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         panel = new JPanel();
//         frame.add(panel);
//         placeComponents();

//         frame.setVisible(true);
//     }

//     private void placeComponents() {
//         panel.removeAll();
//         panel.setLayout(null);

//         JLabel cowIdLabel = new JLabel("Enter Cow ID:");
//         cowIdLabel.setBounds(10, 20, 100, 25);
//         panel.add(cowIdLabel);

//         cowIdField = new JTextField(20);
//         cowIdField.setBounds(120, 20, 165, 25);
//         panel.add(cowIdField);

//         searchButton = new JButton("Search");
//         searchButton.setBounds(10, 60, 150, 25);
//         panel.add(searchButton);

//         clearButton = new JButton("Clear"); // Initialize the clear button
//         clearButton.setBounds(170, 60, 150, 25);
//         panel.add(clearButton);

//         resultLabel = new JLabel("");
//         resultLabel.setBounds(10, 100, 400, 25);
//         panel.add(resultLabel);

//         currentCowLabel = new JLabel("");
//         currentCowLabel.setBounds(10, 140, 400, 25);
//         panel.add(currentCowLabel);

//         frame.revalidate();
//         frame.repaint();
//     }

//     public String getCowIdInput() {
//         return cowIdField.getText();
//     }

//     public void displayResult(String message) {
//         resultLabel.setText(message);
//     }

//     public void displayCurrentCow(String message) {
//         currentCowLabel.setText(message);
//     }

//     public void clearDisplay() {
//         resultLabel.setText("");
//         currentCowLabel.setText("");
//     }

//     public void clearInput() {
//         cowIdField.setText("");
//     }

//     public void resetSearch() {
//         clearDisplay();
//         clearInput();
//     }

//     public void setSearchButtonListener(ActionListener listener) {
//         searchButton.addActionListener(listener);
//     }

//     public void setClearButtonListener(ActionListener listener) {
//         clearButton.addActionListener(listener);
//     }
// }

package View;

import java.awt.event.ActionListener;
import javax.swing.*;

public class CowGUI {
    private JTextField cowIdField;
    private JButton searchButton;
    private JButton clearButton;
    private JLabel resultLabel;
    private JLabel currentCowLabel;
    private JPanel panel;
    private JFrame frame;

    public CowGUI() {
        frame = new JFrame("Cow Information");
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        frame.add(panel);
        placeComponents();

        frame.setVisible(true);
    }

    private void placeComponents() {
        panel.removeAll();
        panel.setLayout(null);

        JLabel cowIdLabel = new JLabel("Enter Cow ID:");
        cowIdLabel.setBounds(10, 20, 100, 25);
        panel.add(cowIdLabel);

        cowIdField = new JTextField(20);
        cowIdField.setBounds(120, 20, 165, 25);
        panel.add(cowIdField);

        searchButton = new JButton("Search");
        searchButton.setBounds(10, 60, 150, 25);
        panel.add(searchButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(170, 60, 150, 25);
        panel.add(clearButton);

        resultLabel = new JLabel("");
        resultLabel.setBounds(10, 100, 400, 25);
        panel.add(resultLabel);

        currentCowLabel = new JLabel("");
        currentCowLabel.setBounds(10, 140, 400, 25);
        panel.add(currentCowLabel);

        frame.revalidate();
        frame.repaint();
    }

    public String getCowIdInput() {
        return cowIdField.getText();
    }

    public void displayResult(String message) {
        resultLabel.setText(message);
    }

    public void displayCurrentCow(String message) {
        currentCowLabel.setText(message);
    }

    public void clearDisplay() {
        resultLabel.setText("");
        currentCowLabel.setText("");
    }

    public void clearInput() {
        cowIdField.setText("");
    }

    public void resetSearch() {
        clearDisplay();
        clearInput();
    }

    public void setSearchButtonListener(ActionListener listener) {
        searchButton.addActionListener(listener);
    }

    public void setClearButtonListener(ActionListener listener) {
        clearButton.addActionListener(listener);
    }
}
