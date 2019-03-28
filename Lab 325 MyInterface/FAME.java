
/**
 * Abstract class FAME - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class FAME implements Album
{
    
    private  String AlbumName;
    private int songs;
    

    /**
     * Constructor for objects of class FAME
     */
    public FAME()
    {
        AlbumName = "F.A.M.E";
        songs = 11;
    }

    public String getAlbum(){
        return AlbumName;
    }
    public int getSongs(){
        return songs;
    }
    
    
}

