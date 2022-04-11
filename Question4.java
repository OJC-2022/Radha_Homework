import java.util.*;
class Question4{
    public static void cube(int x)
    {
        System.out.println("Cube of number :"+(x*x*x));
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        cube(n);
    } 
}