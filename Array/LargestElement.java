//package Array;
import java.util.Scanner;

public class LargestElement{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Size Of Array");
       int size=sc.nextInt();
 
        int arr[]=new int[size];
        System.out.println("Enter Elements In Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int element=arr[0];
        for(int i=0;i<size;i++){
            if(element<arr[i]){
             element=arr[i];
            }
        }
        System.out.println("largest Element In array Is: "+element);

    }
}