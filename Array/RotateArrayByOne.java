import java.util.*;
public class RotateArrayByOne {
    public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Size of Array");
    int size=sc.nextInt();
    int[] arr=new int[size];
    System.out.println("Enter "+size+" Elements In Array");
    for(int i=0;i<size;i++){
     arr[i]=sc.nextInt();
    }

    System.out.println("Before Rotation:");
    for(int i=0;i<size;i++){
        System.out.print(" "+arr[i]);
    }
    arr=RotateArray(arr,size);
        System.out.println();

    System.out.println("After Rotation:");
    
    for(int i=0;i<size;i++){
        System.out.print(" "+arr[i]);
    }
    }
    

    public static int[] RotateArray(int[] arr,int size){
        int temp=arr[0];

        for(int i=0;i<size-1;i++){
       arr[i]=arr[i+1];
        }
        arr[size-1]=temp;
        return arr;
    }
    
}
