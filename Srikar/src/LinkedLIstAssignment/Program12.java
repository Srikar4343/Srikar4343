
import java.util.LinkedList;

public class Program12 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("This");
        obj.add("is");  
        obj.add("Assignment program");
        obj.add("in linkedlist.....");
        obj.add("concept");

        obj.remove(4);

        for (String string : obj) {
            System.out.print(string+" ");
        }
    }
}