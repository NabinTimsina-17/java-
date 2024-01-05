import javax.swing.*;
import java.awt.*;


public class Main extends JFrame {
    public Main() {
        setTitle("Simple Color Change Frame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton blackButton = createColorButton("BLACK", Color.BLACK);
        JButton blueButton = createColorButton("BLUE", Color.BLUE);

        setLayout(new FlowLayout());
        add(blackButton);
        add(blueButton);
    }

    private JButton createColorButton(String text, Color color) {
        JButton button = new JButton(text);
        button.addActionListener(e -> getContentPane().setBackground(color));
        return button;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }
}
