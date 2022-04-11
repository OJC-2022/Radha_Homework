import java.util.*;
class Question12 {

    
    public static void odd_in_range(int n,int m)
    {
        for(int i=n+1;i<m;i++){
            if(i%2==0) continue;
            else System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        odd_in_range(n,m);
    }
}