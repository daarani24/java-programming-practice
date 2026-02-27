import java.util.Scanner;
public class vote {
    public static void main(String ara[]){
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        if (n>=18)
            System.out.print("Eligible to vote");
        else
            System.out.print("Not eligible");
    }
}
