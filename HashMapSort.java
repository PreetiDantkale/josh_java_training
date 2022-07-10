import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
class HashMapSort {
  //Creating HashMap
  HashMap<String, Integer> hm = new HashMap<String, Integer>();
  //Inserting Data into HashMap
  void putData()
  {
    hm.put("Ram", 25);
    hm.put("Sham", 12);
    hm.put("Arjun", 54);
    display(hm);
  }

  void display(HashMap<String, Integer> hm)
  {
    for(Entry<String, Integer> e: hm.entrySet()){
      System.out.println(e.getKey()+" "+e.getValue());
    }
  }

  void sort()
  {
    List<Entry<String, Integer>> l = new LinkedList<Entry<String, Integer>>(hm.entrySet());
    Collections.sort(l, new Comparator<Entry<String,Integer>>()
    {
      public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2)
      {
        return e1.getValue().compareTo(e2.getValue());
      }
    });
    for(Entry<String, Integer> e: l){
      System.out.println(e.getKey()+" "+e.getValue());
    }
  }
  public static void main(String[] args)
  {
    HashMapSort hms = new HashMapSort();
    hms.putData();
    hms.sort();
  }
}