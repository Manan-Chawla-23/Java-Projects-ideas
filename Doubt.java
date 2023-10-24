import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class Doubt extends JFrame {
    public Doubt() {
        this.setVisible(true);
        this.setSize(500, 500);
        this.setTitle("THE GOD");
        MyPanel panel = new MyPanel();
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new Doubt();
        });
    }
}

class MyPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.CYAN);
        g.setColor(Color.MAGENTA);
        g.drawLine(100, 100, 300, 300);
    }
}
