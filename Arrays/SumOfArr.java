import java.util.Scanner;
public class SumOfArr{
  public static void main(String ara[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt(),tot=0;
    int a[]=new int[n];
    for(int i=0;i,n;i++){
      a[i]=s.nextInt();
    }
    for(int i=0;i<n;i++){
      tot+=a[i];
    }
    System.out.print(tot);
  }
}
