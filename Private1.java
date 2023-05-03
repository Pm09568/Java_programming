 class C{
   private void hello(){
        System.out.println("prashant mishra");
    }
}
 class A1 extends C{
}
public class Private1  {
    public static void main(String args[]){
        A1 sc=new A1();
       // sc.hello();
//        Error show because method is private;
    }
}
