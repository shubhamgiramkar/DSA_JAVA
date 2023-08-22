import java.util.*;
public class MoveAllZerosToEnd{
    public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Array Size");
int size=sc.nextInt();
int arr[]=new int[size];
System.out.println("Enter "+size+" Elements In Array");
for(int i=0;i<size;i++){
    arr[i]=sc.nextInt();
}
System.out.println("Before Operation");
    for(int i=0;i<size;i++){
        System.out.print(" "+arr[i]);
    }

MoveZeros(arr,size);
}
public static void MoveZeros(int[] arr,int size){
    int count=0;
    int temp_count=0;
    /* we count the the total zeros in array */
    for(int i=0;i<size;i++){
        
        if(arr[i]==0){
           count++;
        }
    }
    /*we replace the element inside yhe zero elemnt */
    
    for(int i=0;i<size;i++){
        
        
        if(arr[i]==0){
           temp_count++;
           //continue;
        }else{
            arr[i-temp_count]=arr[i];
            temp_count=0;
        }
    }
    //this statement adds zeros at the end of array after total count of non-zero emlements
    // suppose we have 2 non zero elements in array afetr this operation we add zoros after index number
    //of 1 so lastindex of non zero element = total size-number of zero elemnet
   int newsize=size-count;

    for(int i=newsize;i<size;i++){
       
        arr[i]=0;
    }
    System.out.println("After Operation");
    for(int i=0;i<size;i++){
        System.out.print(" "+arr[i]);
    }
}
}