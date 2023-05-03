//   EXAMPLE OF STATIC METHORD;
   public class StaticKeyword {
    static void display(){
        System.out.println("hello");
    }


    //Static class does not extends example given below;

    public static void main(String args[]){
        //we can easily  access method without create object when the method is static;
        StaticKeyword.display();
    }
}
//       EXAMPLE OF STATIC METHOD;

//public class StaticKeyword {
//    static void display(){
//        System.out.println("hello");
//    }
//    //Static class does not extends example given below;
//    class Hello extends StaticKeyword{
//        void display(){
//            //we can not use same method of parent class when it use static Keyword;
//            System.out.println("Prashant ");
//        }
//    }
//    public static void main(String args[]){
//        //we can easily  access method without create object when the method is static;
//        StaticKeyword.display();
//    }
//}


