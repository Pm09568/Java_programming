public class Thiskeyword2 {
    void display(){
        System.out.println("print display");
    }
    void display1(){
        System.out.println("print display1");
        this.display();// this keyword not compulsory becouse compile autometicly use this keyword;
    }
    public static void main(String args[]){
        Thiskeyword2 sc=new Thiskeyword2();
        sc.display1();
    }
}
