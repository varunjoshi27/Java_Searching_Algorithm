/**
 * bubble
 */
import java.util.*;
public class bubble {
 public static void Arrayprint(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
 }

 public static void DescPrint(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
 }
    public static void main(String[] args) {
        //Array input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();

        int arr[]=new int[n];
         System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

    
        

        System.out.println("Enter 1 for ascending sorting and 2 for descending sorting:");
        int choice=sc.nextInt();

        switch (choice) {
            case 1:
            // For Ascending Sorting
            for(int j=0;j<arr.length-1;j++){
                for(int k=0;k<arr.length-j-1;k++){
                     if (arr[k]>arr[k+1]) {
                        //Swap
                        int temp=arr[k];
                        arr[k]=arr[k+1];
                        arr[k+1]=temp;
                        
                     }
                }
            }
    
            System.out.println("Array after Ascending Sorting is:");
            Arrayprint(arr);
                break;

            case 2:
            // For descending Sorting
            for(int i=0;i<arr.length-1;i++){
                for(int j=0;j<arr.length-i-1;j++){
                    if (arr[j]<arr[j+1]) {
                        // Swap
                        int temp= arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
    
                    }
                }
            }
    
            System.out.println("Array after descending sorting is:");
            DescPrint(arr);
            break; 

            default:
            System.out.println("Enter the valid input");
                break;
        }
       
        sc.close();
    }
}