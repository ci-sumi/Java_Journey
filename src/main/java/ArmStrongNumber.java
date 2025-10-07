import java.util.*;
public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int userInput = scanner.nextInt();
        boolean result = armstrong(userInput);
        System.out.println(result);



    }

    public static boolean armstrong(int number) {
        int original = number;
        int count = 0;
        int sum=0;
        int temp = number;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        temp =number;
        while(temp>0){
            int digit =temp%10;
            sum = sum + (int)Math.pow(digit,count);
            temp =temp/10;
        }
        System.out.println(sum);
        return sum==original;
    }
}
