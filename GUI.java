package gouthami;
import javax.swing.*;

    public class GUI {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Addition Program");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);
            frame.setLocationRelativeTo(null); // Center the frame

            // Create input fields and button
            JTextField num1Field = new JTextField(10);
            JTextField num2Field = new JTextField(10);
            JButton addButton = new JButton("Add");

            // Create label to display the result
            JLabel resultLabel = new JLabel("Result: ");

            // Add action listener to the button
            addButton.addActionListener(e -> {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());

                    int sum = num1 + num2;

                    resultLabel.setText("Result: " + sum);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input! Please enter valid numbers.");
                }
            });

            // Create a panel and add components
            JPanel panel = new JPanel();
            panel.add(new JLabel("Number 1:"));
            panel.add(num1Field);
            panel.add(new JLabel("Number 2:"));
            panel.add(num2Field);
            panel.add(addButton);
            panel.add(resultLabel);

            // Add the panel to the frame
            frame.add(panel);

            // Make the frame visible
            frame.setVisible(true);
        }
}
