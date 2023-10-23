import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;
public class RandomWord {
    public static void main(String[] args){
        String champion = "";
        int wordCount = 0;
        while (!StdIn.isEmpty()){
            String currentWord = StdIn.readString();
            wordCount++;
            double probability = 1.0 / wordCount;
            if(StdRandom.bernoulli(probability)){
                champion = currentWord;
            }
        }
        StdOut.print(champion);
    }
}
//end