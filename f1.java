import java.awt.Color;
import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;
import java.awt.BorderLayout;

public class f1 extends Frame {

    f1() {
        this.setSize(500, 400);
        this.setTitle("Frame 1st");
        this.setBackground(Color.decode("#8B8BAE"));
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        Panel contentPanel = new Panel();
        contentPanel.setBackground(Color.decode("#8B8BAE")); // Set the same background color as the frame
        Button b1 = new Button("Center");
        contentPanel.add(b1);

        this.add(contentPanel, BorderLayout.CENTER);
    }

    public static void Show() {
        System.out.println("Hi, I am a function and I am just a glimpse of previous chapters.");
    }

    public static void main(String[] args) {
        f1 F1 = new f1();
        F1.setVisible(true);
        Show();
    }
}
