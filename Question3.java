import java.util.*;
class Question3{
    public static void area(int x,int y)
    {
         System.out.println("Area of rectangle "+(x*y));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length:");
        int length=sc.nextInt();
        System.out.print("Enter breadth:");
        int breadth=sc.nextInt();
        area(length,breadth);
    }
}