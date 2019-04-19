
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

import java.util.*;
public class GridTester{

    private Cell[][] arr;
    private int cols;
    private int rows;

    public GridTester(int row, int col){
        rows = row;
        cols = col;
        arr = new Cell[rows][cols];
        
    }
    
    
    public void loadOccupied(){
         for (int r = 0; r < arr.length ; r ++){
            for (int c = 0 ; c < arr[r].length; c ++){
                if (Math.random() > .7  ){
                    arr[r][c].setOccupied(true); 
                }
                else{
                    arr[r][c].setOccupied(false); 
                }

            }
        }
    }
    
    public void loadNeighbors(){
        ArrayList<Cell> neighbors = new ArrayList<Cell> ();

        for (int r = 0; r < arr.length ; r ++){
            for (int c = 0 ; c < arr[r].length; c ++){
                if (r != 0) {//checks to make sure not in top row
                  // neighbors = neighbors.add(r-1, c);
                }
                if (r != arr.length-1) {
                 //  neighbors = neighbors.add(r+1, c, neighbors);
                }
                if (c != 0) {
                  // neighbors = neighbors.add(r, c-1, neighbors);
                }
                if (c != arr[0].length-1){
                  // neighbors = neighbors.add(r, c+1, neighbors);
                }
            }
        }

    }
}
