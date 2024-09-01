
interface Movies {
    void hollywood();
    //void classic(){}    //Abstract methods do not specify a body

}
interface Webseries {
    //Webseries();    //Interfaces cannot have constructors
    void bollywood();
}
class Indian implements Movies{
    @Override
    public void hollywood() {
        System.out.println("it's not hollywood here...");
    }
    public void bollywood(){
        System.err.println("a lot of webseries");
    }
    //static-> common for all class members objects
    static String actors;
    static void show(){
        System.out.println(actors);
    }
}
public class Oops_Interfaces {
    public static void main(String[] args) {
        Indian ind = new Indian();
        ind.hollywood();
        ind.bollywood();
        Indian.actors = "SRK"; 
        Indian.show();
    }
}
