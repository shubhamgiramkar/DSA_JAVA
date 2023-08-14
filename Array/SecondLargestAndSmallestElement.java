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
        FindSmallElement(arr,size);
        FindLargeElement(arr,size);
    }

 public static void FindSmallElement(int[] arr,int size){
        int currentSmall=arr[0];
        int SecondSmall=Integer.MAX_VALUE;
        for(int i=0;i<size;i++){

if(currentSmall>arr[i]){
    SecondSmall=currentSmall;
    currentSmall=arr[i];
}else if(arr[i]<SecondSmall && arr[i]!=currentSmall){
    SecondSmall=arr[i];
}

        }
        if(SecondSmall==Integer.MAX_VALUE){
        System.out.println("Small:"+currentSmall);
        System.out.println("No second Small value in Array");}
    else if(SecondSmall>=0){
        System.out.println("Small:"+currentSmall);
        System.out.println("SecondSmall:"+SecondSmall);
    }
}

public static void FindLargeElement(int[] arr,int size){
int CurrentLarge=arr[0];
int SecondLarge=Integer.MIN_VALUE;
for(int i=0;i<size;i++){
    if(arr[i]>CurrentLarge){
        CurrentLarge=arr[i];

    }else if(arr[i]>SecondLarge && arr[i]!=CurrentLarge){
        SecondLarge=arr[i];
    }
}
if(SecondLarge<0){
        System.out.println("Large:"+CurrentLarge);
        System.out.println("No Second Large value In Array");}
    else if(SecondLarge>=0){
        System.out.println("Large:"+CurrentLarge);
        System.out.println("SecondLarge:"+SecondLarge);
    }

}


}
