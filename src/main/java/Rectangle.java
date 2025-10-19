import java.util.*;
public class Rectangle {
    int length;
    int width;
    public int area(){
        int Area = length * width;
        return Area;
    }
    public int perimeter(){
        int Perimeter = 2*(length+width);
        return Perimeter;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length");
        int userInput = scanner.nextInt();
        System.out.println("Enter the width");
        int userInputSe = scanner.nextInt();

        Rectangle rectangle = new Rectangle();

        rectangle.length=userInput;
        rectangle.width=userInputSe;
        int areaResult = rectangle.area();
        int resultParameter =rectangle.perimeter();
        System.out.println(areaResult);
        System.out.println(resultParameter);


    }
}
