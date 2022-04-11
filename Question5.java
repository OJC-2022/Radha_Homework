import java.util.*;
class Question5{
    public static void fibonacci(int n)
    {
         int a=0,b=1,c;
        System.out.print(b+" ");
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
            System.out.print(b+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fibonacci(n);
       
    }
}