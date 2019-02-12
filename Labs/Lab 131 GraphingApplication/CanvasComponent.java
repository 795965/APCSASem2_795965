
/**
 * Displying a Simple Shape
 *
 * @author (Ziggy Sheynin)
 * @version (a version number or a date)
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener, ActionListener, KeyListener 
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
    int animationDeltaX = 1;
    int animationDeltaY = 0;
    int gutterX = 10;
    int gutterY = 10;
    Timer animationTimer;
    int motionSpeed = 1;
    int ClickedX;
    int ClickedY;
    boolean OutofShape;
    boolean InShape;
    public CanvasComponent(int width, int height){
        setSize(width, height);
        rectHeight = 20;
        rectWidth = 40;
        rectX = 200;
        rectY = 400;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        animationTimer = new Timer(20, this);
        animationTimer.start();
    }

    public void paintComponent(Graphics g){
        g.setColor(Color.red);
        g.fillRect(rectX, rectY, rectWidth, rectHeight);
        if(InShape == true){
            g.setColor(Color.blue);
            g.fillRect(rectX, rectY, rectWidth, rectHeight);
        }

    }

    //MouseListener Methods
    public void mouseClicked(MouseEvent e){
        //This method is called by Swing when a mouse button is pressed and released.
        if(mouseFromX > rectX && mouseFromX < rectX + rectWidth &&
        mouseFromY > rectY && mouseFromY < rectY + rectHeight){
            InShape = true;
        }  else {
            InShape = false;
        }
        if(InShape = true){
            mouseToX = e.getX();
            mouseToY = e.getY();

            rectX = rectX +(mouseToX - mouseFromX);
            rectY = rectY + (mouseToY - mouseFromY);

            mouseFromX = mouseToX;
            mouseFromY = mouseToY;
            repaint();

        }
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
        if(OutofShape == true){
            mouseToX = e.getX();
            mouseToY = e.getY();

            rectX = rectX +(mouseToX - mouseFromX);
            rectY = rectY + (mouseToY - mouseFromY);

            mouseFromX = mouseToX;
            mouseFromY = mouseToY;
            repaint();

        }
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

        }
    }

    public void mouseMoved(MouseEvent e){
        //This method is called by Swing when the mouse is moved without any button
        //depressed.
        mouseFromX = e.getX();
        mouseFromY = e.getY();
        if(mouseFromX > rectX && mouseFromX < rectX + rectWidth &&
        mouseFromY > rectY && mouseFromY < rectY + rectHeight){
            OutofShape = false;
        }  else {
            OutofShape = true;
        }

    }

    public void actionPerformed(ActionEvent e){
        Dimension componentSizeDimension = getSize();
        if(((rectX+rectWidth) + animationDeltaX + gutterX) > componentSizeDimension.getWidth()){
            animationDeltaX = 0;
            animationDeltaY = 1;
            rectX = (int) componentSizeDimension.getWidth() - rectWidth - gutterX;
            rectY = rectY + animationDeltaY*motionSpeed;
        } else if(rectY +rectHeight+ animationDeltaY +gutterY > componentSizeDimension.getHeight()){
            animationDeltaX = -1;
            animationDeltaY = 0;
            rectY = (int) componentSizeDimension.getHeight() - rectHeight - gutterY;
            rectX = rectX + animationDeltaX*motionSpeed;
        } else if(rectX + animationDeltaX < gutterX ){
            animationDeltaX = 0;
            animationDeltaY = -1;
            rectX = gutterX;
            rectY = rectY + animationDeltaY*motionSpeed;
        }else if(rectY +animationDeltaY < gutterY ){
            animationDeltaX = 1;
            animationDeltaY = 0;
            rectY = gutterY;
            rectX = rectX + animationDeltaX*motionSpeed;
        } else{
            rectX = rectX + animationDeltaX*motionSpeed;
            rectY = rectY + animationDeltaY*motionSpeed;
        }
        repaint();
    }

    public void keyTyped(KeyEvent e){
        //Invoked when a key has been typed. Implementing this method is usually enough
        //for most applications, and it will be for ours
        char keyChar = e.getKeyChar();
        if(keyChar == '+'){
            motionSpeed ++;
        } else if(keyChar == '-'){
            motionSpeed--;
        }
    }

    public void keyPressed(KeyEvent e){
        //Invoked when a key has been pressed. You will leave the implementation of this
        //empty.
    }

    public void keyReleased(KeyEvent e){
        //Invoked when a key has been released. You will leave the implementation of this
        //empty.
    }
}
