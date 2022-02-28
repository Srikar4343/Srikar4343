package src.ExceptionAssignment;

public class Program22 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int arr[] = { 1,2,3,4,5 };
        
        try
        {
            System.out.println("in try");
            System.out.println(a/b);
            System.out.println(arr[3]);
        }
        catch(ArithmeticException s)
        {
            System.out.println();
        }
        catch(Exception e)
        {
            System.out.println(arr[arr.length-1]);
        }
        finally
        {
            System.out.println("in finally");
            try
            {
                System.out.println(10/0);
            }
            catch(Exception h)
            {
                System.out.println("in nested catch");
                try
                {
                    System.out.println("in nested inner try");
                    System.out.println(10/0);
                }
                catch(Exception p)
                {
                    System.out.println(300);
                }
             

            }
            
        }
    }
    
}
