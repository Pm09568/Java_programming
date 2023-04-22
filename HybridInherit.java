
class Shape3{
    // Hybrid inheritrnce ;
    String colour="BLUE";
}
class Triangle2 extends Shape3{
    public void area(int l, int h) {
        System.out.println(l * h / 2);
        System.out.println(colour);
    }
}
class Circle2 extends Shape3{
    public void area (int r){
        System.out.println(3.14 *r*r);
        System.out.println(colour);
    }
}
class CC extends Circle2{
    public void hello(int r){
        System.out.println(3.14 *r*r);
        System.out.println(colour);
        System.out.println("Hello Prashant Mishra");
    }
}

public class HybridInherit {
    public static void main(String args[]){
        int l=10,h=4,r=7;
        Triangle2 obj=new Triangle2();
//        Circle2 obj1=new Circle2();
        CC obj2=new CC();
        obj.area(l,h);
//        obj1.area(r);
       obj2.hello(r);
    }
}


