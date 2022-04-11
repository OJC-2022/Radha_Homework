import java.util.*;
class Question8{
    public static void N_odd(int x)
    {
        int j=1; 
        for(int i=1;i<=x;i++)
        {
             System.out.print(j +" ");   
          j=j+2;
        }
    }
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int x=sc.nextInt(); 
        N_odd(x);
    }
}