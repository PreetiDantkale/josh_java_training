import java.util.*;
class Palindrome{

  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter word to check if its a palindrome or not:");
    String word = sc.nextLine();
    int length = word.length();
    String temp="";
    for(int i = length - 1; i >=0 ; i--){
      temp = temp + word.charAt(i);
    }

    if (temp.equals(word))
      System.out.println(word+" is a palindrome word");
    else
      System.out.println(word+" is not a palindrome word");
  }
}