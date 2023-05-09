public class ThisKeyword1 {
    int roolno;
    String name;
    double marks;
    void display(int rollno,String name,double marks){
      this.roolno=rollno;
      this.name=name;
      this.marks=marks;
    }
    void display1(){
        System.out.println(roolno +" "+name+" "+marks);
    }
    public static void main(String args[]){
        ThisKeyword1 sc=new ThisKeyword1();
        sc.display(39,"Prashant",75.3);
        sc.display1();
    }
}
