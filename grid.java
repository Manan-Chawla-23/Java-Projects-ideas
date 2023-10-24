import java.awt.*;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class grid extends JFrame 
{
    public grid() {
        this.setVisible(true);
        this.setSize(500, 500);
        this.setTitle("GRID layout");
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        JButton b1 = new JButton("CR7");
        JButton b2 = new JButton("LM10");
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 1));
        panel.add(b1);
        panel.add(b2);
        
        this.add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new grid();
        });
    }
}
