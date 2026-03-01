import java.util.Scanner;
public class OddEven{
  public static void main(String ara[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    if (n%2==0) {
      System.out.print("Even");
    }
    else{
      System.out.print("Odd");
    }
  }
}
