package src.CollectionAssignment.HashSetAssignment;

import java.util.HashSet;

public class Program11 {
    public static void main(String[] args) {
        HashSet<String> H=new HashSet<>();
        H.add("one");
        H.add("two");
        H.add("Three");
        H.add("Four");
        H.add("Five");

        HashSet<String> H1=new HashSet<>();
        H1.add("one");
        H1.add("six");
        H1.add("Three");
        H1.add("seven");
        H1.add("Five");

         H.retainAll(H1);
         System.out.println(H);
    }

}
