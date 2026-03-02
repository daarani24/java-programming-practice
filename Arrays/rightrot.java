import java.util.Scanner;
public class rightrot {
    public static void main(String ara[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
            a[i]=s.nextInt();
        rightRot(a);
    }
    static void rightRot(int a[]){
        int n=a.length;
        int t=a[n-1];
        for(int i=n-2;i>=0;i--)
            a[i+1]=a[i];
        a[0]=t;
        for (int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
