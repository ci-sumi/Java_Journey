import java.util.*;
public class FactorialofaNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = scanner.nextInt();
        int result = getfact(userInput);
        System.out.println(result);

    }
    public static int getfact(int number){
        int fact=1;
        for(int i =1;i<=number;i++){
            fact = fact*i;
        }
        return fact;
    }
}
