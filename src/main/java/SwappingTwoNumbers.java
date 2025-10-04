import java.util.Scanner;

public class SwappingTwoNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number");
        int first_number = scanner.nextInt();
        System.out.println("Enter the second number");
        int second_number = scanner.nextInt();
        System.out.println("Before swapping,first number"+first_number+"second number"+second_number);
        first_number = first_number+second_number;
        second_number =first_number-second_number;
        first_number = first_number-second_number;
        System.out.println("After swapping,first number"+first_number+"second number"+second_number);
        scanner.close();
    }
}
