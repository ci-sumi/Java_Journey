public class NestedIf {
    public static void main(String[] args){
        boolean isStudent=false;
        boolean isSenior = true;
        double price = 9.99;
        if(isStudent){
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price*=0.7;
            }
            else{
                System.out.println("You get a student discount of 10%");
                price*=0.9;
            }
            }

        else{
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                price*=0.8;

            }
            else{
                System.out.println("You are not entitled to any of the discound");
            }
        }
        System.out.printf("price is+%.2f",price);
    }
}
