package HashSet;
import java.util.*;
// Write a Java program to convert a hash set to an array.

public class Task7 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("Red");
        hs.add("Blue");
        hs.add("Black");
        hs.add("Dark");
        hs.add("Green");
        System.out.println(hs);
        String ar [] = new String[hs.size()];
        hs.toArray(ar);
        System.out.println("Array Element:");
        for(String s : ar)
            System.out.println(s);

    }
}
