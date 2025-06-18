
class Student{
    String name;
    int rollNo;
    String grade;
     void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Grade: " + grade);
     }

}
public class RunnerSRS{
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Shah jalal";
        s1.rollNo = 047;
        s1.grade = "A";

         Student s2 = new Student();
        s2.name = "Sara";
        s2.rollNo = 102;
        s2.grade = "B";

        s1.display();
        System.out.println("---");
        s2.display();
        System.out.println("---");
    }
}