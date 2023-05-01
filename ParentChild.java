class Parent1{
    static void hello(){
        System.out.println("Prashant ");
    }
}
class Child1 extends Parent1 {
   public void Hello(){
       System.out.println("hello");
   }

}
public class ParentChild {
    public static void main(String args[]){
        Parent1.hello();
    }
}
