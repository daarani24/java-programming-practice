import java.util.Scanner;
public class dectobin {
    public static void main(String ara[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int base=1,bi=0,r;
        while(n>0){
            r=n%2;
            bi=bi+r*base;
            base*=10;
            n=n/2;
        }
        System.out.print(bi);
    }
}
