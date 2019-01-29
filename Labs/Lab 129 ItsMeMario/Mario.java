
/**
 * Write a description of class Mario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mario extends Character
{
    public Mario(String CP, int Speed){
        super(CP, Speed);
    }

    public void setSpeed(int Speed){
        super.setSpeed(Speed*2);
    }
}
