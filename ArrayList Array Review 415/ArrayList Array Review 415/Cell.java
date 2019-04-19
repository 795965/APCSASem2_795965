
/**
 * boolean occupied;

 * int id;
 * List<Cell> neighbors = new ArrayList<Cell>();


 * Write a Cell method:
  
 *  public void loadNeighbors() that will load the neighbors list
 *  with all cells that are not occupied (north, east, south, west only)

 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class Cell
{
    private boolean occupied;
    int id;
    ArrayList<Cell> neighbors;  
    // that will load the neighbors list with all cells that are not occupied (north, east, south, west only)
    public Cell(){
        neighbors = new ArrayList<Cell>();
        occupied = false; 
        id = 0; 
    }
     
    
    public boolean setOccupied (boolean occupied){
        return occupied; 
    }

    
}
