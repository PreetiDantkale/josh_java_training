import java.util.*;
import java.util.Optional;
import java.util.stream.Collectors;

interface Display{
    //default method
    default void display(){
        System.out.println("Default Method");
    }
}
public class Demo implements Display {
    //can override default method
    public void display()
    {
        List<Integer> l = new ArrayList<Integer>();
        l.add(20);
        l.add(56);
        l.add(19);
        l.add(15);

        //ForEach
        l.stream().filter(n -> n > 50).forEach(System.out::println);
    }

    public static void checkOptional()
    {
        String[] str = new String[10];

        //Optional
        Optional<String> value = Optional.ofNullable(str[5]);
        if(value.isPresent())
        {
            System.out.println(str[10]);
        }
        else {
            System.out.println("Value not present");
        }
    }
    public static void main(String[] args)
    {
        Demo d = new Demo();
        d.display();
        Demo.checkOptional();
    }
}
