import java.util.HashMap;
import java.util.HashSet;

/**
 * Keep a record of how many times each word was entered by users.
 * 
 * @author  John Bobby
 * @version 6.7
 */
public class WordCounter
{
    // Associate each word with a count.
    private final HashMap<String, Integer> counts;

    /**
     * Create a WordCounter
     */
    public WordCounter()
    {
        counts = new HashMap<>();
    }
    
    /**
     * Update the usage count of all words in input.
     * @param input A set of words entered by the user.
     */
    public void addWords(HashSet<String> input)
    {
        for(String word : input) {
            int counter = counts.getOrDefault(word, 0);
            counts.put(word, counter + 1);
        }
    }
    
    public void printsWordCounts() 
    {
        for (String word : counts.keySet()){
            System.out.println(word + ":" + counts.get(word));
        }
    }   
}
