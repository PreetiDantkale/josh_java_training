import java.util.*;
@FunctionalInterface
interface Print{
    void display();
}
public class StreamEx implements Print {
    public void display()
    {
        List<Integer> l = new ArrayList<Integer>();
        l.add(20);
        l.add(56);
        l.add(19);
        l.add(15);
        l.stream().filter(n -> n > 50).forEach(System.out::println);
    }
    public static void main(String[] args)
    {
        StreamEx s = new StreamEx();
        s.display();
    }
}
