
/**
 * Abstract class FAME - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class FAME implements Album
{
    
    private  String AlbumName;
    private String songs;
    

    /**
     * Constructor for objects of class FAME
     */
    public FAME(String name)
    {
        AlbumName = name;
    }

    public  String AlbumName(){
        AlbumName = "F.A.M.E.";
        return AlbumName;
    }
    public String songs(){
        songs = "Mi Declaracion, Feliz los 4, Delincuente";
        return songs;
    }
    
    
}

