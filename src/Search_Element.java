import javax.swing.*;
import java.util.Scanner;

public class Search_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array=");
        int number = sc.nextInt();
        System.out.println("Enter the number=");
        int array[] = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the number for search=");
        int tofind = sc.nextInt();
        int count = 0;
        for (int i = 0; i < number; i++) {
            if (array[i] == tofind) {
                System.out.println("Index is " + i);
                count++;

            }

        }
        if (count == 0)
            System.out.println("-1");

    }
}
