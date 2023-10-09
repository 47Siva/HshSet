package HashSet;
import java.util.*;
//Write a Java program to compare two hash set.

public class Task10 {
    public static void main (String args []) {
        HashSet<String> hs = new HashSet();
        hs.add("Red");
        hs.add("Blue");
        hs.add("Black");
        hs.add("Dark");
        hs.add("Green");
        System.out.println(hs);
        HashSet<String> hs2 = new HashSet();
        hs2.add("Red");
        hs2.add("Yellow");
        hs2.add("Black");
        hs2.add("Dark");
        hs2.add("Green");
        for (String s : hs) {
            System.out.println(hs2.contains(s) ? "yse" : "No");
        }

    }
}
