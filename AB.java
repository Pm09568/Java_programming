class M{
    //Private access modifier;
    private int a=25;
  private  String name="Prashant";
}

public class AB {
    public static void main(String[] args) {
       M obj=new M();
        System.out.println(obj.a);
        System.out.println(obj.name);
    }
}
