
public class factorialofanumberforloop {
    public static void main(String[] args) {

        int number = 5;
        long fact = 1;
        for(int i = 1 ; i <= number; i++)
        {
            fact = fact * i;
        }
        {
            System.out.println("Factorial of " +number+ " is: " +fact);
        }
    }

}