class Shape2{
    // Hieriricle inheritrnce ;
    String colour="Yellow";
}
class Triangle1 extends Shape2{
    public void area(int l, int h) {
        System.out.println(l * h / 2);
        System.out.println(colour);
    }
}
class Circle1 extends Triangle1{
    public void area (int r){
        System.out.println(3.14 *r*r);
        System.out.println(colour);
    }
}

public class Hiererichleinherit {
    public static void main(String args[]){
        int l=12,h=4,r=7;
        Triangle1 obj=new Triangle1();
        Circle1 obj1=new Circle1();
        obj.area(l,h);
        obj1.area(r);
    }
}
