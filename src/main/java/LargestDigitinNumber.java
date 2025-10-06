import java.util.*;
public class LargestDigitinNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int userInput = scanner.nextInt();
        int result = largestnumber(userInput);
        System.out.println(result);


    }
    public static int largestnumber(int number){
        int maxnum=0;

        while(number>0){
            int number1 = number%10;
            number = number/10;
            if(number1>maxnum){
                maxnum=number1;

            }
        }return maxnum;

    }
}
