import java.util.Scanner;

public class AverageLargestandSmallest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the" + size +"numbers");
        for(int i =0;i<size;i++){
            numbers[i]=scanner.nextInt();

        }
        AverageLargestSmallest(numbers);


    }
    public static void AverageLargestSmallest(int[]arr){
        int max = arr[0];
        int min = arr[0];
        double sum=0.0;
        for(int i =0;i< arr.length;i++){
            if(arr[i]>=max){
                max = arr[i];
            }
            if(arr[i]<=min){
                min=arr[i];
            }
            sum+=arr[i];

        }

        double average = (double) sum/ arr.length;
        System.out.println("Average of array is"+average);
        System.out.println("The largest number is "+max);
        System.out.println("The smallest number is"+min);
    }

}
