class Stu{
    //constructur without pass arguments;
    int a=10;
    Stu(){
        System.out.println(("this is constructer"));
    }
}
public class Const {
    public static void main(String args[]){
        Stu obj=new Stu();
        System.out.println(obj.a);
    }
}
