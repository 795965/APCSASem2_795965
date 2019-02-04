
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
        CanvasComponent canvasComponent = new CanvasComponent(40, 20);
        jFrame.add(canvasComponent);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
    
    public void main(){
        MySwingApplication mySwingApplication = new MySwingApplication();
        javax.swing.SwingUtilities.invokeLater(mySwingApplication);

        
    }
}
