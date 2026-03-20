import java.util.Scanner;
public class bintodec {
    public static void main(String ara[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int base=1,d=0,r;
        while(n>0){
            r=n%10;
            d=d+r*base;
            base*=2;
            n=n/10;
        }
        System.out.print(d);
    }
}

