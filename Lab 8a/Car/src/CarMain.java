public class CarMain {
    public static void main(String [] args) {
    Car [] cars = new Car[3];
    
    cars[0]= new Car("Rolls Royce", "ghost",2026,30,10,30,30);
    cars[1] = new Car("Mazda", "Mazda 6", 2009, 23, 211000, 30, 10);
    cars[2] = new Car("Toyota", "Camry",2019,7,165000,25,5);

    //Car 1
    cars[0].drive(14);
    cars[0].fillTank(1.5);
    System.out.println(cars[0]);
    System.out.println(cars[0].getFuelRemaining());

    System.out.println();

    //Car 2
    cars[1].drive(120);
    cars[1].fillTank(30);
    System.out.println(cars[1]);
    System.out.println(cars[1].getFuelRemaining());

    System.out.println();

    //Car 3
    cars[2].drive(35);
    cars[2].fillTank(10);
    System.out.println(cars[2]);
    System.out.println(cars[2].getFuelRemaining());


    
    }
}
