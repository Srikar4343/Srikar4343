package src.ArraylistAssignment;
import java.util.ArrayList;

public class Program14 {
    public static void main(String[] args) {
      
            ArrayList<String> colour=new ArrayList<String>();
            colour.add("red");
            colour.add("green");
            colour.add("blue");
            colour.add("pink");
            
            colour.clear();
          
            for (String string : colour) {
                System.out.println(string);
            }
            
    }
    
}