import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
public class NumberGuessing {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int sysrandom = random.nextInt(1,50);

        int number;
        do {
            System.out.println("Enter a number");
            number = scanner.nextInt();
            if (number < sysrandom) {
                System.out.println("Its too low");
            } else if (number > sysrandom) {
                System.out.println("The number is too high");
            } else {
                System.out.println("its matching number");
            }

        } while (number != sysrandom);

    }
}


