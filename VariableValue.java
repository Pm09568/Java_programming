 class Variable1{
      final int  a=20;
}
class Variable2 extends Variable1{
    int a=10;
    void hello(){
        System.out.println(super.a);
    }
}
public class VariableValue extends AA {

    public static void main(String args[]){
         Variable2 sc=new Variable2();
        sc.hello();
    }
}
