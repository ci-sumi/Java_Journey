import java.util.Scanner;
public class MatrixSumOperations {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns");
        int cols = scanner.nextInt();
        int [][]matrix =new int[rows][cols];
        System.out.println("Enter the elements of the Matrix");
        for(int i =0;i<rows;i++ ){
            for(int j=0;j<cols;j++){
                matrix[i][j]=scanner.nextInt();
            }
        }
        int totalSUm =0;
        for(int i =0;i<rows;i++){
            int rowSum=0;

            for(int j=0;j<cols;j++){
                rowSum+=matrix[i][j];
            }

            totalSUm+=rowSum;
            System.out.println("Sum of row"+(i+1)+":"+rowSum);
        }
        for(int j=0;j<cols;j++){
            int colSum=0;
            for(int i=0;i<rows;i++){
                colSum+=matrix[i][j];

            }

            System.out.println("Sum of column"+(j+1)+":"+colSum);
        }

        System.out.println("total sum"+totalSUm);

    }
}
