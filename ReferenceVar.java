class Dmo{
    int a;
    String name;
    void display(){
        System.out.println(a+" "+name);
    }
}
public class ReferenceVar {
    public static void main(String args[]){
        Dmo sc=new Dmo();
        sc.a=100;
        sc.name="Prashant Mishra";
        sc.display();
    }
}
