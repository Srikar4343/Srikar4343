package Assignment11Arrays;

import java.util.ArrayList;

public class Prg16 
{
    public static void main(String[] args) 
    {
            ArrayList<String> colour = new ArrayList<String>();
            colour.add("Green");
            colour.add("Red");
            colour.add("Blue");
            colour.add("Orange");
            colour.add("Yellow");
    
            ArrayList<String> colour1 = new ArrayList<String>();
            colour1.addAll(colour);
    
            for (String string : colour1) 
            {
                System.out.println(string);
            }
        }
    }

