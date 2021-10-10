import java.util.Scanner;
public class Maximum_Array {
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
        for (int i=0;i<number;i++)
        {
            if (max<array[i])
            {
                max=array[i];
            }
        }

            System.out.println("Maximum number is " + max);
    }
}
