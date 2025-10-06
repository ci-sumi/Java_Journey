import java.util.*;
public class SumofDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int userInput = scanner.nextInt();
        int result = sumofDigits(userInput);
        System.out.println(result);


    }
    public static int sumofDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            sum = sum + digit;

        }return sum;

    }
}
