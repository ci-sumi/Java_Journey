import java.util.*;
public class IntegerPalindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = scanner.nextInt();
        boolean result = integerpalindrome(userInput);
        System.out.println(result);


    }
    public static boolean integerpalindrome(int number){
        int original = number;
        int reversed = 0;
        while(number>0){
            int digit = number%10;
            reversed = reversed*10+digit;
            number = number/10;

        }
       return reversed ==original;

    }

}
