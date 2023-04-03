import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener{
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton button10;
    private JTextArea textArea1;
    private JButton button2;

    public Window() {
        setContentPane(mainPanel);
        setTitle("Window test");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        button10.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked");
    }
}
