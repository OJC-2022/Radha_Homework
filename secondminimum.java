import java.util.*;
class secondminimum{
    public static int second_min(int[] arr)
    {
        int curmin=arr[0];
        int secmin=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<curmin)
            {
               secmin=curmin;
               curmin=arr[i];
            }
            else if(arr[i]<secmin && arr[i]!=curmin)
            secmin=arr[i];
        }
        return secmin;
    }
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    int i;
    for(i = 0;i < arr.length;i++)
    {
        arr[i] = sc.nextInt();
    }
    System.out.println("Second minimum="+second_min(arr));
    }
}