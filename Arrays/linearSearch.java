import java.util.Scanner;
public class linearSearch {
    public static void main(String ara[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int k=s.nextInt();
        boolean b=false;
        for(int i=0;i<n;i++){
            if(a[i]==k){
                b=true;
                break;
            }
        }
        if (b)
            System.out.print("Element found");
        else
            System.out.print("Element not found");
    }
}
