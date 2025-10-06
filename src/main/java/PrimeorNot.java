import java.util.*;
public class PrimeorNot {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = scanner.nextInt();
        boolean result =primeornot(userInput);
        System.out.println(result);


    }
    public static boolean primeornot(int number){
        //if number is 1 return false
        if(number<=1){
            return false;
        }

        for(int i=2;i<number;i++){
                if(number%i==0){
                    return false;
            }
        }return true;
    }

}

