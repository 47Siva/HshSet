package HashSet;
import java.util.*;
//Write a Java program to empty an hash set.

public class Task4 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("Red");
        hs.add("Blue");
        hs.add("Black");
        hs.add("Dark");
        hs.add("Green");
        System.out.println(hs);
        hs.clear();
        hs.removeAll(hs);
        System.out.println("After empty the list :"+hs);
    }
}
