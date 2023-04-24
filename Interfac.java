interface Display{
    void hh();
}
class Interface5 implements Display {
    public void hh() {
        System.out.println("hello");
    }
}
public class Interfac {
    public static void main(String args[]) {
        Display sc = new Interface5();
        sc.hh();
    }
}
