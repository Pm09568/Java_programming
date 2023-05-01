class Demo{
    public static void method1(){
        System.out.println("static Method -1 of the Demo class is execursd");
    }
    public void method2(){
        System.out.println("Non static method-2 of the demo class is executed");
    }
}
 public class Overriding extends Demo{
    public static void method1(){
        System.out.println("static method-1 of the sample class is executed");
    }
    public void method2(){
        System.out.println("Non-static Method-2 of hte Sample class is executed");
    }
    public static void main(String args[]){
        Demo d1=new Demo();
        //D2 is reference variable of class Demo that points to objects of class Sample
        Demo d2=new Overriding();
        //method calling with reference (method hiding)
        d1.method1();
        d2.method1();
        //method calling with object (method overriding)
        d1.method2();
        d2.method2();
    }
}


