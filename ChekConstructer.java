 class Body{
    int a;
    String name;
    float b;
    Body(int a){
        this.a=a;
    }
    Body(String name){
        this.name=name;
    }
    Body(float b){
        this.b=b;
        //this.name=name;
    }
    void display(){
        System.out.println(a+" "+name+" "+b);
    }
}
public class ChekConstructer {
    public static void main(String args[]){
        Body sc=new Body(2);
        sc.display();
    }
}
