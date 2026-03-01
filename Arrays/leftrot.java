import java.util.Scanner;
public class leftrot {
    public static void main(String ara[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
            a[i]=s.nextInt();
        leftRot(a);
    }
    static void leftRot(int a[]){
        int n=a.length;
        int t=a[0];
        for(int i=1;i<n;i++)
            a[i-1]=a[i];
        a[n-1]=t;
        for (int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
