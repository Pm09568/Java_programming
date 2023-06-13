import java.util.Scanner;

//class Array{
//    void Hello(){
//        for(int i=0;i<10;i++){
//
//        }
//    }
//}


public class ArraySum {
    public static void main(String args[]){
        int i,sum=0;
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[10];
        for( i=0;i<10;i++){
             arr[i]=sc.nextInt();
        }
        for( i=0;i<10;i++) {
             sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
