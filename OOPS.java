 class Pen{
    //acess variable ussing obj;
    String colour;
    String type;
    void sample(){
        System.out.println("Hello Prashant");
    }
 }
public class OOPS {
    public static void main(String args[]){
        Pen obj=new Pen();
        obj.colour="Red";
        obj.type= "Jell";
        System.out.println(obj.colour+" \n"+obj.type);
        obj.sample();
    }
}
