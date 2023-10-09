package HashSet;
import java.util.*;
//Write a Java program to iterate through all elements in a hash list.

public class Task2 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("Red");
        hs.add("Black");
        hs.add("Dark");
        hs.add("Yellow");
        hs.add("Blue");
        System.out.println(hs);
        Iterator i = hs.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
