//
///display all the odd numbers between 1 to 30 using for loop & if
//statement.
public class FindingOddNumbers {
    public static  void main(String[] args){
        display();

    }
    public static void display(){
        for(int i =1;i<=30;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }

    }
}
