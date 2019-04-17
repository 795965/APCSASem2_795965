
/**
 * Write a description of class someClass here.
 *
 * @author (Ziggy Sheynin)
 * @version (4/15)
 */

import java.util.*;

public class someClass
{
    //Question 4
    ArrayList <String> names = new ArrayList <String>(); //declares and initializes arraylist called names

    public void sortStrings(ArrayList<String> names){
        // sortStrings sorts the contents on names into ascending order
        // You may use, insertion, selection, or merge sort
        for(int i = 0; i < names.size(); i++){ //traverses arrayList Names
            for(int k= i; k >0; k++){ //new variable

                if(names.get(k).compareTo(names.get(k-1)) <0){ //compares using built in CompareTo method
                    String temp = names.get(k); //swap routine
                    names.set(k, names.get(k-1));
                    names.set(k-1, temp);
                }
            }
        }

    }

    public void shuffleStrings(ArrayList<String> names){
        // should shuffle the contents of names
        for(int j= names.size(); j>= 0; j--){ //traverses array starting at the end
            int random = (int)(Math.random()*j); //creates random integer
            String temp = names.get(j);
            names.set(j, names.get(random)); //put the random integer into the array
            names.set(random, temp); //put back the original string

        }
    }

    public void insertString(String word){

        //this method will insert the parameter "word" into the sorted array 
        //at the location where the arrayList remains sorted.
        names.add(word); //put "word into the array
        sortStrings(names); //resorts array
        
    }
}
