import java.util.*;

public class UnionOfTwoSortedArrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size Of 1st Array");
        int size1=sc.nextInt();
        int [] arr1=new int[size1];
        System.out.println("Enter "+size1+" Elements In 1st array:");
        for(int i=0;i<size1;i++){
        arr1[i]=sc.nextInt();
        }

        System.out.println("Enter The Size Of 2nd Array");
        int size2=sc.nextInt();
        int [] arr2=new int[size2];
        System.out.println("Enter "+size2+" Elements In 2nd array:");
        for(int i=0;i<size2;i++){
        arr2[i]=sc.nextInt();
        }
      FindUnion(arr1,arr2,size1,size2);

    }


   public static void FindUnion(int[] arr1,int[] arr2,int size1,int size2){
    int size3=size1+size2;
    int[] arr=new int[size3];
   
    for(int i=0;i<size1;i++){
       
        arr[i]=arr1[i];
        
    }
    
    for(int i=0;i<size2;i++){
       
        arr[size1+i]=arr2[i];
        
    }
    int[] arr4={};
    Arrays.sort(arr);
    int j=0;
    for(int i=0;i<size3;i++){
      while(arr[i]!=arr[i+j]){
        
        arr4[i]=arr[i];
      }
    }
 
  } 
}