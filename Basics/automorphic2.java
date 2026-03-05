import java.util.Scanner;
public class automorphic2 {
    public static void main(String ara[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=n,d=1;
        while(m>0){
            m/=10;
            d*=10;
        }
        if (n%d==((n*n)%d)){
            System.out.print("Automorphic");
        }
        else{
            System.out.print("Not Automorphic");
        }
    }
}
