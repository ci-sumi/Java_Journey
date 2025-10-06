import java.util.*;
public class ReverseNumber {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int userInput = scanner.nextInt();
        int result = reverseNumber(userInput);
        System.out.println("The reversed number is:"+result);

    }
    public static int reverseNumber(int number){
        int revese=0;
        int sum=0;
        while(number>0){
            int reversed = number%10;
            number = number/10;
            revese = revese*10+reversed;
            sum=sum+reversed;

        }
        System.out.println(sum);
        return revese;
    }
}
