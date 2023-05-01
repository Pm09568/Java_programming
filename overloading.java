class display{
    void hello(int a){
        System.out.println(a);
    }
    void hello(String name){
        System.out.println(name);
    }
}

public class overloading {
    public static void main(String args[]){
        display sc=new display();
        sc.hello(10);
        sc.hello("Prashant");
    }
}
