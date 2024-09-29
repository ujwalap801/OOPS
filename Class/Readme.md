
## Class
A class is a collection of objects.
A class is not a real-world entity. It is just a template, blueprint, or prototype.
A class does not occupy memory.


## class can be pre-defined and user defined
# pre-defined 
=>Scanner
=>console
=>System
=>String

# User defined
=>Dog
=>Test


# In object-oriented programming (OOP), a class is a blueprint or a template for creating objects. 
# It defines the attributes (properties) and behaviors (methods) that the objects created from the class will have. 
# A class encapsulates data for the object and methods to manipulate that data.

For example, if we have a class called Car, it might have attributes like color, make, model, and methods like drive() or stop(). The class itself doesn't represent any actual car, but when we create an instance (object) of this class, like myCar, we get a specific car with specific values for those attributes.


// Defining a class
class Car {
    // Attributes (properties) of the class
    String color;
    String model;
    int year;

    // Constructor to initialize the Car object
    Car(String carColor, String carModel, int carYear) {
        color = carColor;
        model = carModel;
        year = carYear;
    }

    // Method (behavior) of the class
    void drive() {
        System.out.println("The " + color + " " + model + " is driving.");
    }

    void stop() {
        System.out.println("The " + model + " has stopped.");
    }
}

// Main class to test Car class
public class Main {
    public static void main(String[] args) {
        // Creating an object (instance) of the Car class
        Car myCar = new Car("Red", "Toyota Camry", 2020);

        // Using the methods of the Car object
        myCar.drive();
        myCar.stop();
    }
}
