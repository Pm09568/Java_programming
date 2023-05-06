public class ThisKeyword3 {
    ThisKeyword3(){
        System.out.println("hello");
    }
    ThisKeyword3(int a){
        this();
        System.out.println(a);
    }
    public static void main(String args[]){
        ThisKeyword3 sc=new ThisKeyword3(10);
    }
}
