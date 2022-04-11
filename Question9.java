import java.util.*;
class Question9{
    public static void even(int x)
    {
         for(int i=x;i>1;i--)
        {
            if(i%2==0)
            System.out.print(i+" ");
        }

    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
       even(x);
    }
}