public class StaticBinding {
    private void eat(){
        System.out.println("Men is eating");
    }
    public static void main(String args[]){
        StaticBinding sc=new StaticBinding();
        sc.eat();
    }
}
