import java.util.*;
public class RotateArrayByKElements{
    public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Element To Rotate Array:");
 int num=sc.nextInt();
 System.out.println("Enter Size Of Array");
 int size=sc.nextInt();
 int [] arr=new int[size];
 System.out.println("Enter "+size+" Elements in array");
for(int i=0;i<size;i++){
    arr[i]=sc.nextInt();
}
System.out.println("Which Rotation You Want?");
System.out.println("1) LEFT"); 
System.out.println("2) RIGHT");
int choice=sc.nextInt();
System.out.println("Befor Rotation:");
for(int i=0;i<size;i++){
    System.out.print(" "+arr[i]);
}
System.out.println();
switch(choice){
    case 1:LeftRotation(arr,size,num);
          
           break;
    case 2:RightRotation(arr,size,num);
           break;
   default:System.out.println("Rotation Not Selected!!");
}


    }
public static void LeftRotation(int[] arr,int size,int num){
    int temp=arr[0],count=0;
    while(count!=num){
     for(int i=0;i<size-1;i++){
        arr[i]=arr[i+1];
     }
     arr[size-1]=temp;
     temp=arr[0];
     count++;
}
System.out.println("After Left Rotation By "+num+" Elements:");
for(int i=0;i<size;i++){
    System.out.print(" "+arr[i]);
}
}

public static void RightRotation(int[] arr,int size,int num){
    int temp=arr[size-1],count=0;
    while(count!=num){
     for(int i=size-1;i>0;i--){
        arr[i]=arr[i-1];
     }
     arr[0]=temp;
     temp=arr[size-1];
     count++;
}
System.out.println("After Rigth Rotation By "+num+" Elements:");
for(int i=0;i<size;i++){
    System.out.print(" "+arr[i]);
}
}
}