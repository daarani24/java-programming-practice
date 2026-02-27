import java.util.Scanner;
public class revFirstHalf {
    public static void main(String ara[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
            a[i]=s.nextInt();
        rev(a);
    }
    static void rev(int a[]){
        int n=a.length;
        int i=0,j=(n/2)-1;
        while(i<j){
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
        for( i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
