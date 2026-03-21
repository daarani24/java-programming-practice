import java.util.Scanner;
public class singleNum {
    public static void main(String ara[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]= new int [n];
        for (int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int res=0;
        for(int x:a)
          res^=x;
        System.out.print(res);
    }
}