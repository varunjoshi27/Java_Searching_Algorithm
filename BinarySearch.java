import java.util.*;
public class BinarySearch {

    public static int binary(int numbers[],int key){
        int start=0,end=numbers.length-1;


        while (start<=end) {
            int mid=(start+end)/2;

            if (numbers[mid]==key) {

                return mid;
                
            }
            if (numbers[mid]<key) {
                start=mid+1;
              
                
            }
            else{
                end=mid-1;
            }
            
        }
        return -1;
    }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n=sc.nextInt();
    
    int numbers[]=new int[n];

    // For entering the elements of the array:
    System.out.println("Enter the elements of the array:");
    System.out.println("Enter the elements in the monotic order:");
    for(int i=0;i<numbers.length;i++){
        numbers[i]=sc.nextInt();
    }

    System.out.println("Enter the number you want to search in the array:");
    int key=sc.nextInt();

  System.out.println("The index for the key is:"+binary(numbers, key));
    sc.close();
 
  }
}
