import java.util.Scanner;
public class Table {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number ");

        int n=sc.nextInt();
        System.out.println("table of " +n);
        for(int i=1;i<=10;i++)
        {
            int m = n * i;
            System.out.println( +m+ "*"+(i+1)+"="+m*(i+1));
        }

    }
}
