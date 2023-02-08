import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        int a=2;
        int b=3;
        int sum =a+b;
        System.out.println("sum is "+sum);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number p ");
        int p= sc.nextInt();
        System.out.println("enter number q ");
        int q= sc.nextInt();
        int div=p*q;
        System.out.println("c is"+div);
    }
}