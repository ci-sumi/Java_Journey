import java.util.Scanner;

import static java.lang.System.exit;

public class SwitchAverageLargeSmall {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the " + size + "numbers");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Enter a number between 1 and 4");
        while (true) {
            System.out.println("\n--MENU---");
            System.out.println("1.Find Average");
            System.out.println("2.Find Largest");
            System.out.println("3.Find Smallest");
            System.out.println("4.Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You chose 1:");
                    averag(numbers);
                    break;
                case 2:
                    System.out.println("You chose 2:");
                    Largest(numbers);
                    break;
                case 3:
                    System.out.println("You chose 3:");
                    smallest(numbers);
                    break;
                case 4:
                    System.out.println("You chose 4:");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1,2,3,4");
            }

        }
    }

    public static void averag(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = (double) sum / arr.length;
        System.out.println("The average of the array is" + average);


    }

    public static void Largest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum is" + max);

    }

    public static void smallest(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        System.out.println("The minimum is" + min);

    }
}
