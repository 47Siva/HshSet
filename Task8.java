package HashSet;
import java.util.*;
//Write a Java program to convert a hash set to a tree set.
public class Task8 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("Red");
        hs.add("Blue");
        hs.add("Black");
        hs.add("Dark");
        hs.add("Green");
        System.out.println(hs);
        TreeSet ts = new TreeSet();
        ts.addAll(hs);
        System.out.println(ts);
    }
}
