class Shape1{
    // multilevel inheritrnce ;
    String colour="Green";
}
class Triangle extends Shape1 {
    public void area(int l, int h) {
        System.out.println(l * h / 2);
        System.out.println(colour);
    }
}
class Circle extends Triangle{
    public void area (int r){
        System.out.println(3.14 *r*r);
        System.out.println(colour);
    }
}

public class MultilevelInherit {
    public static void main(String args[]){
        int l=12,h=4,r=7;
        Triangle obj=new Triangle();
        Circle obj1=new Circle();
        obj.area(l,h);
        obj1.area(r);
    }
}
