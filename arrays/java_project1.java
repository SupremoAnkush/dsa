import java.util.Scanner;

public class java_project1 {
    public static void main(String[] args) {
        // Basic I/O program ///////////////////////
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter name: ");
        // String name = scanner.nextLine();
        // scanner.close();
        // System.err.println("Your name is " + name);

        // 2nd largest number program ///////////////////////
        int a[] = { 10, 9, 20, 30, 40, 15, 16, 21 };
        int first = 0, second = 0, third = 0;
        // int largest = 0;
        // for (int i = 0; i < a.length; i++) {
        // if (a[i] > largest)
        // largest = a[i];
        // }
        // System.out.println("Largest= " + largest);
        // int sec_largest = 0;
        // for (int i = 0; i < a.length; i++) {
        // if (a[i] > sec_largest && a[i] < largest)
        // sec_largest = a[i];
        // }
        // System.out.println("Second Largest= " + sec_largest);

        // 3rd largest number program ///////////////////////
        // for (int i = 0; i < a.length; i++) {
        // if (a[i] > first) {
        // third = second;
        // second = first;
        // first = a[i];
        // } else if (a[i] > second) {
        // third = second;
        // second = a[i];
        // } else if (a[i] > third) {
        // third = a[i];
        // }
        // }
        // System.out.println("Third Largest number = " + third);

        // Product of the largest three numbers of array ////////////////
        for (int i = 0; i < a.length; i++) {
            if (a[i] > first) {
                third = second;
                second = first;
                first = a[i];
            } else if (a[i] > second) {
                third = second;
                second = a[i];
            } else if (a[i] > third) {
                third = a[i];
            }
        }
        int product = first * second * third;
        System.out.println("first_largest = " + first + "\nsecond_largest = " +
                second + "\nthird_largest = " + third);
        System.out.println(first + " * " + second + " * " + third + " = " + product);

    }
}