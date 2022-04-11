import java.util.*;
class Question7{
     public static int HCF(int a,int b)
     {
        if (a == 0)
       return b;
    if (b == 0)
       return a;
  
    if (a == b)
        return a;
  
    
    if (a > b)
        return HCF(a-b, b);
    return HCF(a, b-a);
     }

      public static void LCM(int a,int b)
     {
         int hcf=HCF(a,b);
         System.out.println("HCF="+hcf);
         int lcm=(a*b)/hcf;
        System.out.println("LCM="+ lcm);
     }

    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    LCM(a,b);
}
}