public class First {
    public static void main(String args[]){
       student s=new student();
       System.out.println(s.a+" "+s.b);
       s.abc();
    }
}
class student{
        int a=10;
        int b=20;
     void abc(){
        System.out.println("Prashant Mishra");
    }
}
