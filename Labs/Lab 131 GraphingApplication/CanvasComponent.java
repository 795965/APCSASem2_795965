
/**
 * Displying a Simple Shape
 *
 * @author (Ziggy Sheynin)
 * @version (a version number or a date)
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener 
{

    int rectHeight;
    int rectWidth;
    int rectX;
    int rectY;
    int mouseFromX;
    int mouseFromY;
    boolean shapeSelected;
    int mouseToX;
    int mouseToY;
    public CanvasComponent(int width, int height){

        setSize(width, height);
        rectHeight = 20;
        rectWidth = 40;
        rectX = 200;
        rectY = 400;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g){
        g.setColor(Color.red);
        g.fillRect(400, 300, 40, 40);
    }

    //MouseListener Methods
    public void mouseClicked(MouseEvent e){
        //This method is called by Swing when a mouse button is pressed and released.
    }

    public void mousePressed(MouseEvent e){
        //This method is called by Swing when a mouse button is pressed.
        mouseFromX = e.getX();
        mouseFromY = e.getY();
        if(mouseFromX > rectX && mouseFromX < rectX + rectWidth &&
        mouseFromY > rectY && mouseFromY < rectY + rectHeight){
            shapeSelected = true;
        }  else {
            shapeSelected = false;
        }
    }

    public void mouseReleased(MouseEvent e){
        //This method is called by Swing when a mouse button is released.
    }

    public void mouseEntered(MouseEvent e){
        //This method is called by Swing when the cursor moves inside the bounding box of
        //the component that defines the MouseListener interface.
    }

    public void mouseExited(MouseEvent e){

        //This method is called by Swing when the cursor moves outside the bounding box of
        //the component that defines the MouseListener interface.
    }
    //mouseMotionListenermethods
    public void mouseDragged(MouseEvent e){
        //This method is called by Swing when a mouse button is pressed and then the mouse
        //is moved with the button depressed.
        if(shapeSelected == true){
            mouseToX = e.getX();
            mouseToY = e.getY();

            rectX = rectX +(mouseToX - mouseFromX);
            rectY = rectY + (mouseToY - mouseFromY);

            mouseFromX = mouseToX;
            mouseFromY = mouseToY;
            repaint();
            System.out.println("made it to MouseDragged");
        }
    }

    public void mouseMoved(MouseEvent e){
        //This method is called by Swing when the mouse is moved without any button
        //depressed.
    }
}
