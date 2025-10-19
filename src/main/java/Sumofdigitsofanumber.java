import java.util.*;
public class Sumofdigitsofanumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = scanner.nextInt();
        int result = sumofdigits(userInput);
        System.out.println(result);

    }
    public static int sumofdigits(int number){
        int sum =0;
        while (number>0){
            int digit = number%10;
            sum = sum+digit;
            number= number/10;
        }
        return sum;
    }
}
