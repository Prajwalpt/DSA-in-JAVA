abstract class Animal{
    //constructor
    Animal(){
        System.err.println("created an animal");
    }
    abstract void walk();
    public void eat(){
        System.out.println("animal eats...");
    }
}
class Horse extends Animal{
    //constructor
    Horse(){
        System.out.println("created a horse");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}
public class Oops_Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();  //first base then derived constructor
        h.walk();
        h.eat();    //public method in abstract class
            
        Chicken c = new Chicken();
        c.walk();   
        
        //not allowed to instantiate
        //Animal an = new Animal();

    }
}
