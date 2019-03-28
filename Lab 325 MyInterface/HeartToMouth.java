
/**
 * Abstract class HeartToMouth - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class HeartToMouth implements Album
{
    
    private  String AlbumName;
    private int songs;
    

    /**
     * Constructor for objects of class FAME
     */
    public HeartToMouth()
    {
        AlbumName = "Heart to Mouth";
        songs = 12;
    }

    public String getAlbum(){
        return AlbumName;
    }
    public int getSongs(){
        return songs;
    }
    
    
}
