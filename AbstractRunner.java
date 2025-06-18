// Abstraction means hiding unnecessary details and showing only the essential features of an object.

// 👉 In Java, we achieve abstraction using:

// Abstract Classes

// Interfaces


//abstract class
abstract class Teacher{

    //abstract method 
    public abstract void teachSubject();

    //non abstract method
    public void attendMeeting(){
        System.out.println("Attending faculty meeting...");
    }
}

//subclasses that implememts abstract method
class MathTeacher extends Teacher{
    @Override
    public void teachSubject(){
        System.out.println("Teaching Math...");
    }
}
class EnglishTeacher extends Teacher{
    @Override
    public void teachSubject(){
        System.out.println("Teaching English..");
    }
}
class ScienceTeacher extends Teacher{
    @Override
    public void teachSubject(){
        System.out.println("Teaching Science...");
    }
}


public class AbstractRunner {
public static void main(String[] args) {
    
    Teacher t1 = new MathTeacher();
    Teacher t2 = new EnglishTeacher();
    Teacher t3 = new ScienceTeacher();

    t1.teachSubject();
    t2.teachSubject();
    t3.teachSubject();

    t1.attendMeeting();
    
}    
}
