class Student{
    String name;
    int age;
    
    //constructor: to create an object
    //1.Default constructor(non parameterized)
    // Student(){  
    //     //gets print at first
    //     System.out.println("non parameterized constructor");
    // }

    //2.Parameterized constructor
    // Student(int name, int age){  
    //     this.name = name;
    //     this.age = age;
    // }
    
    //3.copy constructor
    Student(Student s2){
        this.name = "praj";
        this.age = 22;
    }
    //should be passed if using copy constructor
    Student(/*if no args-> returns null and 0 */){
        this.name = "prajwal";
        this.age =21;
    }
    
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class Oops2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        // s1.name = "prajwal";
        // s1.age = 21;
        s1.printInfo();
        //name->null
        //age->0 
        //as empty constructor
        //for s2
        Student s2 = new Student(s1);
        s2.printInfo();
        //name->praj
        //age->null
    }
}
