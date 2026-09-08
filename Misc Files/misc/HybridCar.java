package misc;

 //extend from car is needed so it inherits everything from car
public class HybridCar{ 
    int batteryCapacity;


    public HybridCar(int bc){
        //make..
        //model..
        //year..
        //milesDriven..
        //fuelCapacity..
        //fuelRemaining..
        // 6 lines repeated call constructor from car by...
        // super(mk,mo,y,md,fc,fr); super is another word for parent class
        // to use the constructor from the parent class (one above this class)
        // must be first line in the class and the paramters must be passed in order
        batteryCapacity = bc;
    }
}

// HyrbidCar koreysNewWheels = new HybridCar("ford","C-Max",...)