
/**
 * The GridTester class:
 * Create a constructor function that has parameters for number of rows 
 * and number of columns for a 2D array of Cell objects.
 * Create a 2D array of Cell objects with the number of rows 
 * and columns specified by the input parameters.
 * Write a GridTester  method : 
 *       public void loadOccupied() 
 *       that will randomly set 30% of the cell's 
 *       occupied property to true and the rest to false;

 * @author (Ziggy Sheynin)
 * @version (4/15)
 */
public class GridTester{

    private Cell[][] arr;
    private int cols;
    private int rows;

    public GridTester(int row, int col){
        rows = row;
        cols = col;
        arr = new Cell[rows][cols];
        
    }
    
    // I have no idea what I am doing...
    //This is clearly wrong...
    //I tried.
    //public void loadOccupied(){
        // int i = rows;
        // int j = cols;
        // if(i< 3){
            // arr.set(j, true);
        // }
        // arr.set(j, false);
    // }
}
