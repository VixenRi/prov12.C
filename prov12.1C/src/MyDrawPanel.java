import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g){
g.setColor(Color.MAGENTA);
g.fillOval(100,100,122,122);
    }
}
