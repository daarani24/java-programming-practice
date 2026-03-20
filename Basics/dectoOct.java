import java.util.Scanner;
public class dectoOct {
    public static void main(String ara[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),base=1,oct=0,r;
        while(n>0){
            r=n%8;
            oct=oct+r*base;
            base=base*10;
            n/=8;
        }
        System.out.print(oct);
    }
}
