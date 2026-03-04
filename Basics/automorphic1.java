import java.util.Scanner;
public class automorphic1{
    public static void main(String ara[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n%10==(n*n)%10){
            System.out.print("Automorphic");
        }
        else{
            System.out.print("Not Automorphic");
        }
    }
}