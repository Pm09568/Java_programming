import java.util.*;
public class LinearSearch {
    public static void main(String args[]){
        int i ,value=5;
        Scanner sc=new Scanner(System.in);
        int number[]=new int[10];
        System.out.println("enter element");
        for( i=0;i<10;i++){
            number[i]=sc.nextInt();
        }

        for( i=0;i<10;i++) {
           if(number[i]==value){
               System.out.println(" index is = "+i);
           }
        }
    }
}
