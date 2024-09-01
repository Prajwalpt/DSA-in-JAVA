//Polymorphism
class Students{
    String name;
    int age;
    //1.Compile time polymorphism-> Function Overloading
    public void printInfo(String name,int age){
        System.out.print(name+" "+age);
        System.out.println();
    }

    public void printInfo(String name){
        System.out.println(name);
        //System.out.println(this.age);
    }
    

    public void printInfo(int age){
        //System.out.println(this.name);
        System.out.println(age);
    }
}
public class Oops3_Polymorphism {
    public static void main(String[] args) {
      Students s1 = new Students();
      s1.printInfo("prajwal");  
      s1.printInfo("prajwal",22);  
      s1.printInfo(27);  
    }
}
