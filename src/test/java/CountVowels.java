
import java.util.*;
public class CountVowels {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String userInput = scanner.nextLine();
        int result = checkvowels(userInput);
        System.out.println(result);

    }
    public static int checkvowels(String vowels){
        String getvowels = vowels.toLowerCase();
       int vowelsCount =0;
       int consonant=0;
        for(int i =0;i<getvowels.length();i++){
            char ch = getvowels.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowelsCount++;

            }
            else{
                consonant++;
            }
        }
        System.out.println("consonants"+consonant);
        return vowelsCount;
    }
}
