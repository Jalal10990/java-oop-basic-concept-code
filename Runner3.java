
//Encapsulation – Data Hiding
// Encapsulation means binding the data (variables) and code (methods) together and hiding it from outside direct access. We do this using private variables and public getters/setters.

//Like a capsule, you can only take it (method to access), but you can't see what's inside directly (private data). Same in programming.

class person {
    ///private data
    private String name;
    private int age;

    //public method to access private data
    public void setName(String n){
        name = n;
    }
    public String getName(){
      return name;
    }
    public void setAge(int a){
        age = a;
    }
    public int getAge(){
      return age;
    }

}

public class Runner3 {
    public static void main(String[] args) {
        person p1 = new person();
        p1.setName("Shah jalal");
        p1.setAge(19);

        System.out.println("name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());
    }
}
