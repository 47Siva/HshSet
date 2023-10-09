package HashSet;
import java.util.*;
//Write a Java program to compare two sets and retain elements that are the same

public class Task11 {
    public static void main(String args []) {
        HashSet<String> hs = new HashSet();
        hs.add("Red");
        hs.add("Blue");
        hs.add("Black");
        hs.add("greay");
        hs.add("Green");
        System.out.println(hs);
        HashSet<String> hs2 = new HashSet();
        hs2.add("Red");
        hs2.add("Yellow");
        hs2.add("Black");
        hs2.add("Dark");
        hs2.add("Green");
        System.out.println(hs2);
        hs.retainAll(hs2);
        System.out.println(hs);
    }
}
