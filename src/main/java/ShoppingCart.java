import java.util.*;
public class ShoppingCart {
    public static void main(String[] args){
        System.out.println("*****SHOPPING CART*****");
        Scanner scanner = new Scanner(System.in);




        System.out.println("What you like to buy:?");
        String item = scanner.nextLine();
        System.out.println("Whats the price for each:?");
        double price = scanner.nextDouble();
        System.out.println("How many would you like to buy:?");
        int quantity = scanner.nextInt();
        System.out.println("You have bought:"+quantity+""+item+"/s");
        double total = quantity * price;
        System.out.println("Your total is:"+"$"+total);
        scanner.close();






    }
}
