
class Employee{
String name;
int age;
String employeeId;
double salary;


public void setEmployeeDetails(String name, int age, String employeeId, double salary ){
    this.name = name;
    this.age = age;
    this.employeeId = employeeId;
    this.salary = salary;

}
public void displayEmployeeDetails(){
    System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
}

}

//child class
class Manager extends Employee{
    String department;
    double bonus;

public void setManagerDetails(String department, double bonus){
    this.department = department;
    this.bonus = bonus;
}

    public void displayManagerDetails(){
        //call parant class method
        displayEmployeeDetails();
        //manager specific info
        System.out.println("Department: " + department);
        System.out.println("Bonus: " + bonus);
    }
}
//main class
public class InheritenceEmpMang {
    public static void main(String[] args) {
        //cretae manager object
        Manager m1 = new Manager();
        //set employee details(inherited from employee)
m1.setEmployeeDetails("Bilal",20 , "EMP011", 80000);

//set manager specific details
 m1.setManagerDetails("IT Department", 15000);

 //show full details
 m1.displayManagerDetails();

    }
}
