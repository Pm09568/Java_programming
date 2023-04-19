package Prashant;
import java.util.*;
class Greatest{

	public void display() {
			System.out.println(" enter A,B,C = ");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			
	       if(a>b && a>c) {
	    	   System.out.println("A is greatest");
	       }
	       else if(b>c && b>a) {
	    	   System.out.println("B is greatest");
	       }
	       else {
	    	   System.out.println("C is greatest");
	       }
		}

	}

public class Greater3number {

	public static void main(String[] args) {
	
Greatest sc=new Greatest();
sc.display();
}
}
