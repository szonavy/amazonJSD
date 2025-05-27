package thirdmodul.firsttask;

public class Car {
    String make = "Ford"; // stores the car's make (like Ford, Toyota)
    String model = "Mustang"; // stores the car's specific model name (like Mustang, Camry)
    String color = "white"; // stores the car's color (like Red, Silver)
    int year = 2015; // stores the car's manufacturing year (like 2020)

    public String getCarDetails() {
        // build, and return a string by adding each car property with a label
        // and using new line character \n
        return "Make: " + make + "\nModel: " + model + "\nColor: " + color + "\nYear: " + year;
    }
}
