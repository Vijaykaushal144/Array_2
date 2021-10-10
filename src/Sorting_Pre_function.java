import java.util.Arrays;
import java.util.Scanner;

public class Sorting_Pre_function {
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
        Arrays.sort(a);
        for (int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ,");
        }
    }
}
