
//Inheritance – "Reusability of Code"
// Inheritance allows a class to use the properties and methods of another class.

 class  Person{
String name;
int age;

public void displayInfo(){
    System.out.println("Name: " + name);
        System.out.println("Age: " + age);
}

} 
class Student extends Person{
    int rollNo;
    double marks;

    public void displayStudentInfo(){
        //call parent method
        displayInfo();
        //student specifi info
         System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}
public class InheritenceRunner {
    public static void main(String[] args) {
        Student s1 = new Student();

        //Access inherited and own fields
        s1.name = "jalal";
        s1.age = 19;
        s1.rollNo = 047;
        s1.marks = 80.5;


        //show all info
        s1.displayStudentInfo();
    }
}
