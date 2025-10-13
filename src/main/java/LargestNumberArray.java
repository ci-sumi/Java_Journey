import java.util.Scanner;
import java.util.Scanner.*;
public class LargestNumberArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = scanner.nextInt();
        int [] numbers = new int[size];
        System.out.println("Enter the"+size+"numbers");
        for(int i =0;i<size;i++){
            numbers[i]=scanner.nextInt();
        }
        int largest = findlargest(numbers);
        System.out.println(largest);

    }
    public static int findlargest(int [] arr){
        int max =arr[0];
        for(int i =1;i<arr.length;i++){
            if (arr[i]>=max){
               max=arr[i];
            }
        }
        return max;
    }
}
