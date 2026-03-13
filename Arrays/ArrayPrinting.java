import java.util.Scanner;
public class Arrayprint {
  public static void main(String ara[]) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    for (int i=0;i<n;i++){
      a[i]=s.nextInt();
    }
    for (int i=0;i<n;i++){
      System.out.print(a[i]);
    }
  }
}
