public class ThisKeyword4 {

        ThisKeyword4(){
            this(10);
            System.out.println("hello");
        }
        ThisKeyword4(int a){

            System.out.println(a);
        }
        public static void main(String args[]){
            ThisKeyword4 sc=new ThisKeyword4();
        }
    }

