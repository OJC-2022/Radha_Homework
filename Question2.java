import java.util.*;
class Question2{
    public static void divisible(int y)
    {
        if(y%7==0)
        {
            System.out.println("Divisible by 7");
        }
        else
        {
            System.out.println("Not Divisible by 7");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int x=sc.nextInt(); 
        divisible(x);
    }
}