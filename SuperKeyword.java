class Super1{
    void display(){
        System.out.println("hello");
    }
}
class Super2 extends Super1{

    void display(){
        super.display();
        System.out.println("Mishra ji");
    }
}
public class SuperKeyword {
    public static void main(String args[]){
        Super2 sc=new Super2();
        sc.display();
    }
}
