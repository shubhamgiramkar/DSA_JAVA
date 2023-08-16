import java.util.*;
public class ArraySortedOrNot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int size=sc.nextInt();
        boolean ascending_flag=false;
        boolean descending_flag=false;
        int arr[]=new int[size];
        System.out.println("Enter Elements In array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size-1;i++){
            if(arr[i]<=arr[i+1]){
                ascending_flag=true;
            }else{
                ascending_flag=false;
                break;
            }
        }
        if(ascending_flag){
            System.out.println("Array Is Sorted In Assending Order");
        }else{
            for(int i=0;i<size-1;i++){
            if(arr[i]>=arr[i+1]){
                descending_flag=true;
            }else{
                descending_flag=false;
                break;
            }
        }
        }

        if(descending_flag){
            System.out.println("Array Is Sorted In Decending Order");
        }else if(!descending_flag&& !ascending_flag){
            System.out.println("Array Is not sorted");
        }

    }
}
