import java.util.Scanner;

//1 Write a program to find the total number of occurrences of a word inside a Statement.
//        Eg. “people love to love people”
//        Output : people : 2
//        love:  2
//        to : 1
public class WordOccurence {
    public static void main(String args[]){
        System.out.println("Enter Sentence:");
        Scanner sc = new Scanner(System.in);
        String sent = sc.nextLine();
        System.out.println("Enter word:");
        String text = sc.nextLine();
        String[] str = sent.split(text, -1);
        System.out.println(str.length - 1);
    }
}
