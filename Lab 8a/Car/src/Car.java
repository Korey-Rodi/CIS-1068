public class Car {
    String make;
    String model;
    int year;
    double mpg;
    double milesDriven;
    double fuelCapacity;
    double fuelRemaining;

    public Car(String ma, String mo, int y, 
    double m,int miles, 
    double capacity, double remaining){
        make = ma;
        model = mo;
        year = y;
        mpg = m;
        milesDriven = miles;
        fuelCapacity = capacity;
        fuelRemaining = remaining;
    }
    public void fillTank(double g){
        if (fuelRemaining + g > fuelCapacity){
            fuelRemaining = fuelCapacity;
        } else {
            fuelRemaining = fuelRemaining + g;
        }
    }

    public void drive(double miles){
        milesDriven += miles;
        fuelRemaining -= miles / mpg;
    }

    public double getFuelRemaining(){
        return fuelRemaining;
    }

    public String toString(){
        return "Make: " + make + "\nModel: " + model + "\nYear: " + year + "\nMPG: "
        + mpg + "\nMiles Driven: " + (int)milesDriven + "\nFuel Capacity: " + fuelCapacity 
        + "\nFuel Remaining: " + fuelRemaining;
    }
}
