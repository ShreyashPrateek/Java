// Classes and Objects
// At the heart of OOP lie classes and objects.

// What is a Class?
// A class is a blueprint or template used to create objects. It defines:

// State (variables/fields)
// Behavior (methods/functions)
// Think of a class as a design for a real-world entity.

// What is an Object?
// An object is an instance of a class. When an object is created, 
// memory is allocated, and it can use the properties and behaviors defined in the class.

package OOPs;

class Car {
    String brand;
    String model;
    int year;
}

public class Class_and_Object {
    public static void main(String[] args) {
        Car carObj1 = new Car(); // Creating object

        carObj1.brand = "Toyota";
        carObj1.model = "Corolla";
        carObj1.year = 2026;

        System.out.println(carObj1.brand+", "+carObj1.model+", "+carObj1.year);
    }
}

