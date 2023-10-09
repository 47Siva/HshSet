package HashSet;
import java.util.*;
// Write a Java program to clone a hash set to another hash set.
public class Task6 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("Red");
        hs.add("Blue");
        hs.add("Black");
        hs.add("Dark");
        hs.add("Green");
        System.out.println(hs);
        HashSet hs2 = new HashSet();
        hs2.addAll(hs);
        System.out.println("After get clone :"+hs2);
    }
}
