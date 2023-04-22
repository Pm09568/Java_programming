class AA {
    int z;


    void Addition(int a,int b) {
        z=a+b;
        System.out.println( "Additon is "+z);
    }

    void Substraction(int a,int b) {
        z=a-b;
        System.out.println("Subtraction is"+z);
    }
}
public class Inherit1 extends AA {


    void Multiplication(int a,int b) {
        int c=a*b;
        System.out.println("Multiplication is "+c);
    }
    public static void main(String args[]){
        int a=20,b=10;
        Inherit1 obj=new Inherit1();
//        AA obj=new Inherit1(); //base class not access child class methord;

        obj.Addition( a, b);
        obj.Substraction(a,b);
        obj.Multiplication(a,b);

}
}