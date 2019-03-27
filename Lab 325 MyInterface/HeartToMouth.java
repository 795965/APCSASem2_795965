
/**
 * Abstract class HeartToMouth - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class HeartToMouth implements Album
{
    
    private  String AlbumName;
    private String songs;
    

    /**
     * Constructor for objects of class FAME
     */
    public HeartToMouth(String name)
    {
        AlbumName = name;
    }

    public  String AlbumName(){
        AlbumName = "Heart To Mouth";
        return AlbumName;
    }
    public String songs(){
        songs = "Dreamer, Girls Go Wild, Die for You";
        return songs;
    }
    
    
}
