import java.util.*;
class Question6{
    public static void prime(int x)
    {
        boolean flag=true;
        for(int i=2;i<x/2;i++)
        {
         if(x%i==0)
         {
            flag=false;
            break;
         }
        }
        if(flag==false)
        {
            System.out.println("Not prime");
        }
        else
        {
            System.out.println("Prime");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int x=sc.nextInt();  
        prime(x);
        
    }
}