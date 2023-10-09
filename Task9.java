package HashSet;
import java.util.*;
// Write a Java program to convert a hash set to a List/ArrayList.
public class Task9 {
    public static void main(String[] args) {
        TreeSet <String> ts = new TreeSet<String>();
        ts.add("Red");
        ts.add("Blue");
        ts.add("Black");
        ts.add("Dark");
        ts.add("Green");
        System.out.println(ts);
        List l = new ArrayList<>(ts);
        System.out.println(l);
    }
}
