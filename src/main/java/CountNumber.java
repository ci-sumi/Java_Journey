import java.util.*;
public class CountNumber {
    static int count =0;
    static int sum=0;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = scanner.nextInt();
        int results = countNumber(userInput);
        System.out.println(results);


    }
    public static  int countNumber(int number){
        while(number>0){
            int digit = number%10;
            sum = sum+digit;
            number = number/10;
            count++;

        }
        System.out.println("Sum of two digits "+sum);
        return count;
    }
}
