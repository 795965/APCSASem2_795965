
/**
 * Lab to create Graphing Application
 *
 * @author (Ziggy Sheynin)
 * @version (Lab 131)
 */
import javax.swing.*;

public class MySwingApplication implements Runnable
{
    
    public void run(){
        JFrame jFrame = new JFrame("window");
        jFrame.setSize(500, 762);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CanvasComponent canvasComponent = new CanvasComponent(40, 30);
        jFrame.add(canvasComponent);
        jFrame.setVisible(true);
        jFrame.addKeyListener(canvasComponent);
    }
    
    public static void main(){
        MySwingApplication mySwingApplication = new MySwingApplication();
        javax.swing.SwingUtilities.invokeLater(mySwingApplication);

        
    }
}
