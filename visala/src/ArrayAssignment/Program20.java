package src.ArrayAssignment;

public class Program20 {
    public static void main(String[] args) {
        
        int array[]={1,2,3,4,5,6,7,8,9,10};  
        System.out.println("even Numbers =");  
        for(int i=0;i<array.length;i++)
        {  
            if(array[i]%2==0)
            {  
            System.out.print(array[i]+" ");  
            }
        }
        System.out.println();
        System.out.println("odd Numbers =");  
        for(int i=0;i<array.length;i++)
        {  
            if(array[i]%2!=0)
            {  
                System.out.print(array[i]+" ");  
            }  
        }
       ;  
        
    }
    
}
