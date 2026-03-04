import java.util.Scanner;
public class IndofMinEle {
    public static void main(String ara[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int min=a[0];
        int index=0;
        for(int i=0;i<n;i++){
            if (a[0]<min){
                min=a[i];
                index=i;
            }
        }
        System.out.print(index);
    }
}
