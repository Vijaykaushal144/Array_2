import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array =");
        int n=sc.nextInt();
        System.out.println("Enter the element of array=");
        int a[]=new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int round,temp,i;
        for (round=1;round<=n-1;round++)
        {
            for (i=0;i<=n-1-round;i++)
            {
                if (a[i]>a[i+1])
                {
                    temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }
        for (i=0;i<n;i++)
        {
            System.out.print(a[i]+" ,");
        }
    }
}
