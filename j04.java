import java.awt.*;
import javax.swing.*;
import java.io.IOException;
import javax.imageio.ImageIO;
public class j04 extends JFrame 
{
    private Image backgroundImage;
    j04() 
    {
        try 
        {
            backgroundImage = ImageIO.read(getClass().getResource("dino.PNG"));
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        this.setTitle("Frame for channel");
        this.setSize(500, 500);
        JPanel contentPanel = new JPanel() 
        {
            @Override
            protected void paintComponent(Graphics g) 
            {
                super.paintComponent(g);
                // Draw the background image
                if (backgroundImage != null) 
                {
                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };
        this.add(contentPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> 
        {
            new j04();
        });
    }
}

