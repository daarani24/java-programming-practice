import java.util.Scanner;
public class count {
    public static void main(String ara[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        while(n>0){
            n=n/10;
            count+=1;
        }
        System.out.print(count);
    }
}
