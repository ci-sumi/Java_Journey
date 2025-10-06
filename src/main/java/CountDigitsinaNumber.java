import java.util.*;
public class CountDigitsinaNumber {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int userInput = scanner.nextInt();
        int result = countDigit(userInput);
        System.out.println(result);


        }
    public static int countDigit(int number){
        int count =0;
        while(number>0){
            number = number/10;
            count++;

        }
        return count;
    }

}
