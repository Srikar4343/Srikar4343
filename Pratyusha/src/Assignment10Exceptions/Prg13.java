package Assignment10Exceptions;

public class Prg13 
{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            System.out.println(a/b);
        }catch(ArithmeticException ae)
        {
            b=2;
            System.out.println(a/b);
        }
    }
}
