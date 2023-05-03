public class Static1 {
    static int count=0;
    Static1(){
        count++;
        System.out.println(count);
    }
    public static void main(String args[]){
        Static1 sc=new Static1();
        Static1 sc1=new Static1();
        Static1 sc2=new Static1();

    }
}
