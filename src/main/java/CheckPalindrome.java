import java.util.Scanner;
public class CheckPalindrome {
    public static  void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = scanner.nextInt();;
        boolean result =palindrome(userInput);
        if (result){
            System.out.println("Its palindrome");
        }
        else{
            System.out.println("Its not a palindrome");
        }



    }
    public static boolean palindrome(int number){
        int original =number;
        int reversed =0;

        while(number>0){

            int digit = number%10;
            reversed = reversed*10+digit;
            number =number/10;




        }
        return original==reversed;
    }
}
