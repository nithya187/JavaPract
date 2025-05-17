
// File: CarShowroom.java
// A class to demonstrate Car Showroom Management

public class CarShowroom {
    public static void main(String[] args) {
        // Creating three Car objects
        Car car1 = new Car("Audi", "G-4", 2020);
        Car car2 = new Car("Honda", "Vessel", 2019);
        Car car3 = new Car("Kia", "Carnival", 2021);
        
        // Display car details
        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();
    }
}

class Car {
    private String brand;
    private String model;
    private int year;
    
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
}
