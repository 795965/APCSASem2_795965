
/**
 * Displying a Simple Shape
 *
 * @author (Ziggy Sheynin)
 * @version (a version number or a date)
 */
import java.awt.*;
import javax.swing.*;
public class CanvasComponent extends JComponent
{

    int height;
    int width;
    int x;
    int y;
    public CanvasComponent(int width, int height){
        setSize(width, height);
        height = 20;
        width = 40;
        x = 200;
        y = 400;
    }
    
    public void paintComponent(Graphics g){
        g.setColor(Color.red);
        g.fillRect(40, 30, 200, 400);
    }
}
