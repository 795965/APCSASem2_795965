
/**
 * Lab 129 looking at super sub class relationships
 *
 * @author (Ziggy Sheynin)
 * @version (Lab 129 ItsMeMario)
 */
public class Main
{
  public static void main(){
      Character mario = new Mario("It's Me Mario", 100);
      mario.setSpeed(100);
      System.out.println(mario.getCatchPhrase());
      System.out.println(mario.getSpeed());
    }
}
