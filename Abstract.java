//
// abstract class Hello{
//     void display(){
//         System.out.println("Hello");
//     }
//
//}
//class Hello1 extends Hello{
//
//}
//
//public class Abstract {
//    public static void main(String args[]){
//        Hello sc=new Hello1();
//        sc.display();
//    }
//}

abstract class Hello{
//    if methord is Abstract then you are not giving body in abstract methord;
    abstract void display();

}
class Hello1 extends Hello{
    void display(){
        System.out.println("Hello Prashant Mishra");
    }

}

public class Abstract {
    public static void main(String args[]){
        Hello sc=new Hello1();
        sc.display();
    }
}
