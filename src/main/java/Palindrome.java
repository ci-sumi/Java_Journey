import java.util.Locale;

public class Palindrome {
    public static void  main (String args[]){
        System.out.println(ispalindrome("sumi"));






    }
    public static boolean ispalindrome(String str){
        //conver to lowecase
        str =str.toLowerCase();
        //create StringBuilder with string
        //reverse the order of the characters and converts to normal
        String reversed = new StringBuilder().reverse().toString();
        //checks both strings are equal
        return str.equals(reversed);

    }



    }

