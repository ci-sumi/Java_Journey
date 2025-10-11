import java.util.Scanner;
public class Evenorodd {
    public static void main(String[] args){
    int number =0;
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a possitive number");
        int userInput = scanner.nextInt();
        boolean result = evenodd(userInput);
        number=userInput;
        if(result){
            System.out.println("its a even number");
        }
        else{
            System.out.println("Its a odd number");
        }


    }
    public static boolean evenodd(int number){
        return number%2==0;

    }
}
