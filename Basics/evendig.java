import java.util.Scanner;
public class evendig {
    public static void main(String ara[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),r;
        while(n>0){
            r=n%10;
            if(r%2==0){
                System.out.println(r);
            }
            n=n/10;
        }
    }
}
