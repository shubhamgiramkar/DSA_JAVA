import java.util.*;
public class LinearSearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of Array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter "+size+" Elements In Array:");
        for(int i=0;i<size;i++){
          arr[i]=sc.nextInt();
          
        }
        System.out.println("Enter Element to search:");
        int element=sc.nextInt();
        boolean flag=false;
       for(int i=0;i<size;i++){
          if(arr[i]==element){
            System.out.println(element+" element is searched at the index "+i );
            flag=true;
          }
          
        }

        if(!flag){
            System.out.println(element+" is not present in array");
        }
    }
}