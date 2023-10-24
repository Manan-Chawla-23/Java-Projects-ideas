import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class j03 extends Frame 
{
    j03() 
    {
        this.setVisible(true);
        this.setTitle("Frame for channel");
        this.setSize(400, 400);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) 
    {
        j03 j1 = new j03();
    }
}
