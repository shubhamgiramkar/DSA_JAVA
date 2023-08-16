//program for remove duplicates from sorted array
import java.util.*;
import java.util.Arrays;
public class RemoveDuplicates {
 public static void main(String [] args){
    System.out.println("Enter Arrray Size");
 Scanner sc=new Scanner(System.in);
 int size=sc.nextInt();
  int[] arr=new int[size];
  System.out.println("Enter "+size+"Array Element:");
  for(int i=0;i<size;i++){
    arr[i]=sc.nextInt();
  }
  int[] SortedArray=SortArray(arr,size);
  System.out.println("After Sorting:");
  for(int i=0;i<size;i++){
    System.out.println(SortedArray[i]);
  }
  int[] NewArray=RemoveDuplicateElements(SortedArray,SortedArray.length);
  int SizeOfNewArray=NewArray.length;
  System.out.println("After Removed:");
  for(int i=0;i<SizeOfNewArray;i++){
    System.out.println(NewArray[i]);
  }
 }  

 //method for check given array is sorted or not if array is sorted then return array if array is not sortd then return sorted array
 public static int[] SortArray(int[] arr,int size){
    boolean Assending_flag=false;
    boolean descending_flag=false;
    for(int i=0;i<size-1;i++){
     if(arr[i]<=arr[i+1]){
        Assending_flag=true;
     }else{
        Assending_flag=false;
        break;
     }
    }
     if(!Assending_flag){
for(int i=0;i<size-1;i++){
     if(arr[i]>=arr[i+1]){
        descending_flag=true;
     }else{
        descending_flag=false;
        break;
     }
    }
    }
      if(!Assending_flag && !descending_flag){
        //int [] SortedArray;
        Arrays.sort(arr);
       

    }
    return arr;
 } 

 public static int[] RemoveDuplicateElements(int[] arr,int size){
    int[] NewArray= new int[size];
    int count=0;
    NewArray[0]=arr[0];
    for(int i=1;i<size;i++){
        if(NewArray[count]==arr[i]){
            i++;
        }else if(NewArray[count]!=arr[i]){
            count++;
            NewArray[count]=arr[i];
        }
    }
   
    return NewArray;
 }
}
