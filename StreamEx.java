import java.util.*;
import java.util.stream.Collectors;

@FunctionalInterface
interface Print{
    void display(List l);
}
public class StreamEx implements Print {
    public void display(List filteredList)
    {
        filteredList.forEach(System.out::println);
    }
    public static void main(String[] args)
    {
        StreamEx s = new StreamEx();
        List<Integer> l = new ArrayList<Integer>();
        l.add(20);
        l.add(56);
        l.add(19);
        l.add(15);
        List filteredList = l.stream().filter(n -> n > 50).collect(Collectors.toList());
        s.display(filteredList);
    }
}
