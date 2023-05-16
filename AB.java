class M{
    //Private access modifier;
    //if you use private keyword then obj not access value of class M;
     int a=25;
   String name="Prashant";
}

public class AB {
    public static void main(String[] args) {
       M obj=new M();
        System.out.println(obj.a);
        System.out.println(obj.name);
    }
}
