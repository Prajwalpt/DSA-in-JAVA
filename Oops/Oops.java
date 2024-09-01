class Pen{  //creating a class
    //data members(properties)
    String color;
    String type;
    //member functions(actions)
    public void write(){
        System.out.println("Writing...");
    }
    //member functions(actions)
    public void printColor(){
        System.out.println(this.color); 
        //this -> 1.current instance of an object
        //        2.passes current obj as parameter
    }
}
public class Oops {
    public static void main(String[] args) {
        //creating an object
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";
        //function call
        pen1.write();
        //to print color property
        pen1.printColor();
        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.printColor();
    }
}
