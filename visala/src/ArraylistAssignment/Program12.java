package src.ArraylistAssignment;

import java.util.ArrayList;

public class Program12 {
    public static void main(String[] args) {
        ArrayList<String> colour=new ArrayList<String>();
        colour.add("red");
        colour.add("green");
        colour.add("blue");
        colour.add("pink");
      
        System.out.println(colour.subList(1, 2));
    }
}
