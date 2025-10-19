public class Car {

    class Carone{
        String color;
        String model;

        void drive(){
            System.out.println("The car is driving");
        }

    }
    public static void main(String[] args){
        Car outer = new Car();
        Carone myCar = outer.new Carone();
        myCar.color="Red";
        myCar.model="Tesela";
        myCar.drive();
        System.out.println("Car model"+myCar.model);
        System.out.println("Car color"+myCar.color);

    }
}
