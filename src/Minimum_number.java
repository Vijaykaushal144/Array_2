import java.util.Scanner;
public class Minimum_number {
    public static void main(String[] args) {
        Scanner ac=new Scanner(System.in);
        System.out.println("Enter the size of array=");
        int number=ac.nextInt();
        int array[]=new int[number];
        System.out.println("Enter the element of number=");
        for (int i=0;i<number;i++)
        {
            array[i]=ac.nextInt();
        }
        int max=array[0];
        int i=0;
        for (i=0;i<number;i++)
        {
            if (max>array[i])
            {
                max=array[i];
            }

        System.out.println("Minimum number is " + max);
    }
}
}
