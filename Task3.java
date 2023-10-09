package HashSet;
import java.util.*;
// Write a Java program to get the number of elements in a hash set.

public class Task3 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("Red");
        hs.add("Blue");
        hs.add("Black");
        hs.add("Dark");
        hs.add("Green");
        System.out.println(hs);
        Iterator i = hs.iterator();
        int count = 0 ;
        while (i.hasNext()){
            i.next();
            count++;
        }
        System.out.println("Number of Element in set :"+count);
    }
}
