package Assignment15TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Prg4 
{
    public static void main(String[] args) 
    {
        TreeSet<String> Colour = new TreeSet<String>();
        Colour.add("Pink");
        Colour.add("Blue");
        Colour.add("Black");
        Colour.add("Violet");
        Colour.add("Purpule");
        
        
        Iterator<String> str = Colour.descendingIterator();
        while(str.hasNext())
        {
           System.out.print(str.next()+" ");
        }
        System.out.println();

    }
}
