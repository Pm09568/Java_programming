import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        for(int count=1;count<=10;count++){

            System.out.println("table "+n*count);
        }

    }
}
