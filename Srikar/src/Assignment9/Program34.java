package Assignment9;

public class Program34 {

    public static void main(String[] args) 
    {
        int[] a=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int  num=0;
        for (int i = 0; i < a.length; i++) 
        {
            num=num+a[i];
        }
        double avg=num/a.length;
        System.out.println("Average = "+avg);
    }
}
    
