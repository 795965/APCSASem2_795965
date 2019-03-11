
/**
 * Writing FRQ WordPair
 *
 * @author (Ziggy Sheynin)
 * @version (3/11/19)
 */

import java.util.ArrayList;

public class WordPairList 
{
    private ArrayList<WordPair> allPairs; //initializes all pairs arrayList
   public WordPairList(String [] words){
       allPairs = new ArrayList<WordPair>(); //assigns wordPair ArrayList to allPairs
       for(int i = 0; i < words.length -1; i++){ 
           for(int j = i+1; j < words.length; j++){ //nested for loop to traverse array words
               allPairs. add(new WordPair(words[i], words[j])); //adds the two words to the arrayList all Pairs
            }
        }
    }
    
    public int numMatches(){
        int numMatches = 0; //counter
        for(int i = 0; i < allPairs.size(); i++){ 
            WordPair pair = allPairs.get(i);//traverses array
            if(pair.getFirst().equals(pair.getSecond())){ //if the two words are the same
                numMatches++; //counter adds one
            }
        }
        return numMatches; //returns the number of times the words are the same
    }
    
    public void main(){
        
    }
}
