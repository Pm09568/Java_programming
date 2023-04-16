class B{
    // constructur passing arguments;
    String name;
    int age;
    B(String name,int age) {


        System.out.println(name);
        System.out.println(age);
    }
}
public class Const2 {
    public static void main(String args[]){
        B obj=new B("Prashant",25);

    }
}
