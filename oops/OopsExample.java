package oops;

public class OopsExample {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2024, "Blue");

        myCar.displayCarInfo(); //Car: Toyota Camry, Color: Blue

        myCar.displayVehicleInfo(); //Vehicle: Toyota Camry, Year: 2024
        System.out.println("My car's model is: " + myCar.getModel()); //My car's model is: Camry
    }
}



//Parent class  
class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void displayVehicleInfo() {
        System.out.println("Vehicle: " + make + " " + model + ", Year: " + year);
    }
}

class Car extends Vehicle {
    private String color;

    public Car(String make, String model, int year, String color) {
        super(make, model, year);
        this.color = color;
    }

    public void displayCarInfo() {
        System.out.println("Car: " + getMake() + " " + getModel() + ", Color: " + color);
    }
}
 