package Assignment13;

import java.util.PriorityQueue;

public class Program10 {
    public static void main(String[] args) {
        PriorityQueue<String> colour = new PriorityQueue<>();
        colour.offer("Green");
        colour.offer("Red");
        colour.offer("Blue");
        colour.offer("Orange");
        colour.offer("Yellow");

        Object arr[] = colour.toArray();
        for (Object object : arr) {
            System.out.print(object+" ");
        }
    }
}
