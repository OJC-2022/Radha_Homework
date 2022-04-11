import java.util.*;
class Question10{
    public static void divisible_m(int n,int m)
    {
        for(int i=1;i<=n;i++)
        {
            System.out.print(m*i+" ");
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
       divisible_m(n,m);
    }
}