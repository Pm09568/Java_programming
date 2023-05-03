class Shape{
    // Single inheritance;
    String colour="red";
}
class Triangal extends Shape{
    public void area(int l,int h){
        System.out.println(l*h/2);
        System.out.println(colour);
    }
}
public class SingleInherit {
    public static void main(String args[]){
       int l=10,h=5;

        Triangal obj= new Triangal();

        obj.area(l,h);
    }
}
