import java.util.*;
class printingtable{
    public static void printOutTable(int n){
    for(int i=1;i<=10;i++){
      System.out.println(n+" X "+i+" = "+n*i);
    }
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    printOutTable(n);
  }
}