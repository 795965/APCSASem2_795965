
/**
 * A mountain climbing club maintains a record of the climbs that its members have made. Information about a
 * climb includes the name of the mountain peak and the amount of time it took to reach the top. The information is
 * contained in the ClimbInfo class as declared below.
 *
 * @author (Ziggy Sheynin)
 * @version (FRQ HWK 4/9/19)
 */
public class ClimbInfo
{

    /** Creates a ClimbInfo object with name peakName and time climbTime.
     * @param peakName the name of the mountain peak
     * @param climbTime the number of minutes taken to complete the climb
     */

    private String name;
    private int time;
    public ClimbInfo(String peakName, int climbTime)
    { 
       name = peakName;
       time = climbTime;
    }

    /** @return the name of the mountain peak
     */
    public String getName()
    {
        return name;
    }

    /** @return the number of minutes taken to complete the climb
     */
    public int getTime()
    { 
        return time;
    }
    // There may be instance variables, constructors, and methods that are not shown.
} 

