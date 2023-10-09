package HashSet;
import java.util.*;
// Write a Java program to remove all elements from a hash set.

public class Task12 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("Red");
        hs.add("Blue");
        hs.add("Black");
        hs.add("Dark");
        hs.add("Green");
        System.out.println(hs);
        hs.removeAll(hs);
        System.out.println();
        System.out.println(hs);
    }
}
