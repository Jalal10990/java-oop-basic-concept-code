
// what is oop?
// Object-Oriented Programming (OOP) is a way of writing programs using objects — like how we deal with real-world things (person, car, book, etc.)

//OOP Main Concepts
// Concept	Explanation (Easy English)	Real-World Example
// Class	Blueprint/template to create objects	Like a "Car" design
// Object	Real thing created using the class	Honda Civic made from Car class
// Encapsulation	Binding data with methods (hide details)	Medicine capsule (hide inner details)
// Inheritance	One class can get features from another	Child inherits from parents
// Polymorphism	One name, many forms	A man is a father, employee, player
// Abstraction	Hiding complex code, showing only use	Driving a car (you don’t see the engine)


 class Car{
    String color;
    int speed;

    void start(){
        System.out.println("Car is starting..");
    }
}
public class EncapRunner1{
   public static void main(String[] args) {
    Car myCar = new Car(); //object created
    myCar.color = "Red"; //set data
    myCar.speed = 100;
    myCar.start();  //call  method
    System.out.println("Color: " + myCar.color);
    System.out.println("Speed: " + myCar.speed + "Km/h");
   }
}