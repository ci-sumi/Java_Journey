import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int userInput = scanner.nextInt();
        int result =fibonacci(userInput);
        System.out.println(result);


    }

    public static int fibonacci(int number) {
        int a = 0;
        int b = 1;
        int next = 0;
        for (int i = 3; i < number; i++) {
            next = a + b;
            a = b;
            b = next;
        }
        return next;
    }
}
