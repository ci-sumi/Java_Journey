import java.util.*;
public class FactorialofNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int userInput = scanner.nextInt();
        int result = factorial(userInput);
        System.out.println("The factorial of number is:"+result);


    }

    public static int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++){
            factorial = factorial * i;
    }return factorial;
}
}