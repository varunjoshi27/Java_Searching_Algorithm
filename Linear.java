import java.util.*;
/**
 * hello
 */
public class Linear {

    public static int LinearSearch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if (number[i]==key) {
                return i;
                
            }
        }
        return -1;
    } 

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int number[]=new int [n];
        System.out.println("Enter the elements in the array:");
       // For the input of the elements in the array
        for(int i=0;i<n;i++){
            number[i]=sc.nextInt();
        }

        System.out.println("Enter the number you want to find in the array:");
        int key=sc.nextInt();

        int index=LinearSearch(number, key);

      if (index==key) {
        System.out.println("The element id found is the index:"+index);
        
      }else{
        System.out.println("The element is not");
      }
    }
}