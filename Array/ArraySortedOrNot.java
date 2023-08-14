import java.util.*;
public class ArraySortedOrNot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int size=sc.nextInt();
        boolean flag=true;
        int arr[]=new int[size];
        System.out.println("Enter Elements In array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size-1;i++){
            if(arr[i]<arr[i+1]){
                flag=true;
            }else{
                flag=false;
            }
        }
        if(flag){
            System.out.println("Array Is Sorted");
        }else{
            System.out.println("Array Is not Sorted");
        }
    }
}
