public class InitializeByMethod {
    int a;
    String name;
    public void display(int a, String name){
        this.a=a;
        this.name=name;
    }
    void display1(){
        System.out.println(a+" \n"+name);
    }
    public static void main (String args[]){
        InitializeByMethod sc= new InitializeByMethod();
        InitializeByMethod obj= new InitializeByMethod();
        sc.display(100,"Prashant Bhaiya");
        obj.display(200,"Mishra");
        sc.display1();
        obj.display1();
    }
}
