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
    int temp=0,count=0;
    for(int i=0;i<size-1;i++){
        while(arr[i]==0){
         count++;
         for(int j=i;j<size-1;j++){
         arr[j]=arr[j+1];}
        }
        arr[size-1]=temp;
        count=0;
        
    }
    System.out.println("After Operation");
    for(int i=0;i<size;i++){
        System.out.print(" "+arr[i]);
    }
}
}