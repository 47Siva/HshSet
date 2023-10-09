package HashSet;
import java.util.*;
// Write a Java program to test if a hash set is empty or not.
public class Task5 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("Red");
        hs.add("Blue");
        hs.add("Black");
        hs.add("Dark");
        hs.add("Green");
        System.out.println(hs);
        if(hs.isEmpty())
            System.out.println("Yes The Hash set is empty");
        else
            System.out.println("No the Hash set is not empty");
        hs.clear();
        System.out.println(hs);
        if (hs.isEmpty())
            System.out.println("Yes The Hash set is empty");
        else
            System.out.println("No The Hash set is not rmpty");
    }
}
