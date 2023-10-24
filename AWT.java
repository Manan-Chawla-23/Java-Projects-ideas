import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;


/*
 * object----->component------>AWT subpackagess
 * 
 */
class AWT extends JFrame 
{
    AWT() 
    {
        this.setVisible(true);
        this.setSize(400, 400);
        this.setTitle("FRAME USING THE AWT PACKAGE");
        MyPanel panel = new MyPanel();
        this.add(panel);
    }

    public static void main(String[] args) 
    {
        AWT a1 = new AWT();
    }
}

class MyPanel extends JPanel 
{
    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        setBackground(Color.WHITE); // Set the background color to blue
        g.setColor(Color.MAGENTA);
        g.drawLine(50, 50, 100, 100);
    }
}
