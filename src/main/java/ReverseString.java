import java.util.*;
public class ReverseString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(("Enter the string:"));
        String userInput = scanner.nextLine();
        String result = revese(userInput);
        System.out.println(result);

    }
    public static String revese(String str){
        String reversed = "";
        for(int i=str.length()-1;i>=0;i--){
            reversed = reversed+str.charAt(i);
        }
        return reversed;
    }
}
