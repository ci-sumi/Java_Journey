    import java.util.Scanner;
    public class LargestNumber {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the  size of array");
            int size = scanner.nextInt();
            int [] numbers =new int[size];
            System.out.println("Enter"+size+"numbers");
            for(int i =0;i<size;i++){
                numbers[i]= scanner.nextInt();
            }
            int largest =findLargest(numbers);
            System.out.println("The largest number is"+largest);
            scanner.close();


        }
        public static int findLargest(int[] arr){
            int max= arr[0];
            for(int i =1;i<arr.length;i++){
                if(arr[i]>=max){
                    max=arr[i];
                }
            }
            return max;
        }
    }
