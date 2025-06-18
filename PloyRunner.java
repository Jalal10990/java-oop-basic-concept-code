
//Polymorphism in Java – “One name, many forms”

// Polymorphism means "many forms" — it allows one method name to perform different tasks depending on the object or situation.

// There are two types:

// Compile-time Polymorphism → Method Overloading

// Run-time Polymorphism → Method Overriding (via Inheritance)


//parant class

class Shape{
    public void calculateArea(){
System.out.println("Calculating area of shape..");

    }
}
//create child classes that override the method
class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
        }
        @Override
        public void calculateArea(){
            double area = 3.14 * radius * radius;
            System.out.println("Area of Circle: " + area);
        }
}

class Ractangle extends Shape{
    double length, width;

    Ractangle(double length, double width){
        this.length = length;
        this.width = width;

    }
    @Override
    public void calculateArea(){
        double area = length * width;
        System.out.println("Area of Ractangle: " + area);
    }
}
public class PloyRunner {
  public static void main(String[] args) {
    //create different shape objects
    Shape s1 = new Circle(5); //thhis is circle object
    Shape s2 = new Ractangle(4, 6); //this is ractangle object

    //same method name, diffferent output
    s1.calculateArea(); //call circl method
    s2.calculateArea(); //call Ractangle method
  }  
}
