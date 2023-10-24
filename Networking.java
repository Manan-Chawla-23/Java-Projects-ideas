//import java.net.http;

import javax.swing.JFrame;
//import java.awt.JPanel;

public class Networking  extends JFrame{
    private static final Object Button = null;
    private static final int NORTH = 0;
    Networking()
    {
        this.setVisible(true);
        this.setTitle("New project");
        this.setSize(500,500);

        Button b1=new Button("Main bar");
        this.add(b1,Button,NORTH);
    }
    private void add(Button b1, Object button2, int north2) {
    }
    public static void main(String[]args)
    {
  Networking n1=new Networking();
    }
}
