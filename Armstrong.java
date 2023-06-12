import java.util.Scanner;

public class Armstrong {
    void display(int n){
        int c=n;
        int arm=0,a;
        while(n>0){
             a=n%10;
             arm=arm+(a*a*a);
             n=n/10;
        }
        if (arm==c){
            System.out.println("Number is armstrong");
        }
        else{
            System.out.println("Number is Not armstrong");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out .println("Enter Number");
         int n=sc.nextInt();
         Armstrong obj=new Armstrong();
         obj.display(n);
    }
}
