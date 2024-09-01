//import bank.*;
class Shape{
    public void area(){
        System.out.println("displays area");
    }
}
//Single level Inheritance
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println("area of triangle:"+l*h*1/2);
    }
}

//Multi level Inheritance
class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println("area of Equilateral triangle:"+l*h*1/2);    
    }
}

//Hierarchical Inheritance
class Circle extends Shape{
    public void area(int r){
        System.out.println("area of Circle:"+3.14*r*r);    
    }
} 

public class Oops4_Inheritance {
    public static void main(String[] args) {
        //Shape s = new Shape();
        //s.area();

        //single level
        Triangle t = new Triangle();
        t.area();
        t.area(4, 5);
        
        //multilevel
        EquilateralTriangle et = new EquilateralTriangle();
        et.area(6,6);

        //hierarchical
        Circle c = new Circle();
        c.area(25);

        //Bank classs
        // bank.Bank ac = new Bank();
        // ac.name = "ppt";
        
    }
}
