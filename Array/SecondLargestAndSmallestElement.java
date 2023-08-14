//package Array;
import java.util.*;

public class SecondLargestAndSmallestElement {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Array Size");
      int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        } 
        FindElement(arr,size);
    }
    public static void FindElement(int[] arr,int size){
        int currentSmall=arr[0];
        int SecondSmall=Integer.MAX_VALUE;;
        for(int i=0;i<size;i++){

if(currentSmall>arr[i]){
    SecondSmall=currentSmall;
    currentSmall=arr[i];
}else if(arr[i]<SecondSmall && arr[i]!=currentSmall){
    SecondSmall=arr[i];
}

        }
        if(SecondSmall==-1){
        System.out.println("Small:"+currentSmall);
        System.out.println("No second Small value SecondSmall");}
    else{
        System.out.println("Small:"+currentSmall);
        System.out.println("SecondSmall:"+SecondSmall);
    }
}}
