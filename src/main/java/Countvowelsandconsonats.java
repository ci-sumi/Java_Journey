import java.util.*;
public class Countvowelsandconsonats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String userInput = scanner.nextLine();
        String result = count(userInput);
        System.out.println(result);

    }

    public static String count(String str) {
        str = str.toLowerCase();
        int vowels=0;
        int constants = 0;
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                constants++;
            }
        }return "Vowels:"+vowels+ "Constants"+constants;
    }

}
