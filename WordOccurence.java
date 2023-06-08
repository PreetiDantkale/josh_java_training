import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//Write a program to find the total number of occurrences of a word inside a Statement.
//Eg. “people love to love people”
//Output : people : 2
//love:  2
//to : 1
public class WordOccurence {
  public static void main(String args[]) {
    // Enter sentence
    System.out.println("Enter Sentence:");
    Scanner sc = new Scanner(System.in);
    String sentence = sc.nextLine();
    String[] words = sentence.split(" ");
    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < words.length; i++) {
      if (map.containsKey(words[i])) {
        map.put(words[i], map.get(words[i]) + 1);
      } else {
        map.put(words[i], 1);
      }
    }
    for(Entry<String, Integer> e: map.entrySet()){
      System.out.println(e.getKey()+" "+e.getValue());
    }
  }
}
