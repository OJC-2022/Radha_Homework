import java.util.*;  
class Question1{
    public static void even_odd(int y)
    {
        if(y%2==0)
        System.out.println("EVEN NUMBER");
        else
        System.out.println("ODD NUMBER");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int x=sc.nextInt();  
        even_odd(x);
    }
}