
/**
 * Write a description of class Character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Character
{
    String catchPhrase;
    int speed;
    
    public Character(String CP, int Speed){
       catchPhrase = CP;
       speed = Speed;
    }
    public void setCatchphrase(String CP){
        catchPhrase = CP;
    }
    
    public String getCatchPhrase(){
        return catchPhrase;
    }
    
    public void setSpeed(int Speed){
        speed = Speed;
    }
    
    public int getSpeed(){
        return speed;
    }
}
