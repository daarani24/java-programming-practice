import java.util.Scanner;
public class sumofdigit {
    public static void main(String ara[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        while (n>0){
            int r=n%10;
            sum+=r;
            n/=10;
        }
        System.out.print(sum);
    }
}