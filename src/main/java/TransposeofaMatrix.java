import  java.util.*;
public class TransposeofaMatrix {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your row");
    int row = scanner.nextInt();
    System.out.println("Enter the column");
    int colum =scanner.nextInt();
    System.out.println("Enter the numbers");
    int [][] matrix = new int[row][colum];
    int [][] transpose = new int[colum][row];
    for(int i=0;i<row;i++){
        for(int j=0;j<colum;j++){
            matrix[i][j]=scanner.nextInt();
        }
    }
    for(int i =0;i<row;i++){
        for(int j=0;j<colum;j++){
            transpose[j][i]=matrix[i][j];
        }
    }
    System.out.println("Transpose of the matrix");
    for(int i =0;i<colum;i++){
        for (int j=0;j<row;j++){
            System.out.println(transpose[i][j]+" ");
        }
        System.out.println();
    }
    scanner.close();
}
}
