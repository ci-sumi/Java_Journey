import java.util.Scanner;

public class LargestandSmallest {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the " +size+ "of numbers");
        for(int i =0;i<size;i++){
            numbers[i]= scanner.nextInt();
        }
         largestSmallest(numbers);


    }
    public static void largestSmallest(int [] arr){
        int max = arr[0];
        int min =arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=max){
                max=arr[i];
            }
            if(arr[i]<=min){
                min=arr[i];
            }
        }

        System.out.println(max);
        System.out.println(min);

    }

}
