package Assignment8.StringExcersises;

public class Program33 {
    public static void main(String[] args) 
    {

            String str = "NemomeN";
            int length = str.length();
            String ref = "";
            for(int i = length; i>=1 ; i--)
            {
                ref = ref + str.charAt(i-1);
            }
            System.out.println(ref);
            if(ref.equals(str))
            {
                System.out.println("given string is a palindrome");
            }
            else 
            {
                System.out.println("given string is not a palindrome");
            }

    }
}
