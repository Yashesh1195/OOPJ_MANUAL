import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Practical_10_1 extends JFrame {
    private JTextField tfNumber = new JTextField(5);
    private JTextArea taNumbers = new JTextArea(5, 20);
    private LinkedList<Integer> list = new LinkedList<>();

    public Practical_10_1() {
        setTitle("Practical_10_1");
        setLayout(new BorderLayout());

        // Top panel with label and text field
        JPanel panelTop = new JPanel();
        panelTop.add(new JLabel("Enter a number: "));
        panelTop.add(tfNumber);
        add(panelTop, BorderLayout.NORTH);

        // Center area with text area
        taNumbers.setEditable(false);
        add(new JScrollPane(taNumbers), BorderLayout.CENTER);

        // Bottom panel with buttons
        JPanel panelBottom = new JPanel();
        JButton btnSort = new JButton("Sort");
        JButton btnShuffle = new JButton("Shuffle");
        JButton btnReverse = new JButton("Reverse");

        panelBottom.add(btnSort);
        panelBottom.add(btnShuffle);
        panelBottom.add(btnReverse);
        add(panelBottom, BorderLayout.SOUTH);

        // Action: Enter number
        tfNumber.addActionListener(e -> {
            try {
                int number = Integer.parseInt(tfNumber.getText().trim());
                if (!list.contains(number)) {
                    list.add(number);
                    updateTextArea();
                } else {
                    JOptionPane.showMessageDialog(this, "Duplicate number!", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
                tfNumber.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid integer.");
            }
        });

        // Action: Sort
        btnSort.addActionListener(e -> {
            Collections.sort(list);
            updateTextArea();
        });

        // Action: Shuffle
        btnShuffle.addActionListener(e -> {
            Collections.shuffle(list);
            updateTextArea();
        });

        // Action: Reverse
        btnReverse.addActionListener(e -> {
            Collections.reverse(list);
            updateTextArea();
        });
    }

    private void updateTextArea() {
        taNumbers.setText("");
        for (int num : list) {
            taNumbers.append(num + " ");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Practical_10_1 frame = new Practical_10_1();
            frame.setSize(400, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
