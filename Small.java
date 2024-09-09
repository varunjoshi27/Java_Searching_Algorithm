import java.util.Scanner;

public class Small {

    public static int small(int array[][]){
      int n=3,m=3;
    int small=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          if (array[i][j]<small) {
            small=array[i][j];
            
          }
          
        }
    }
    return 1;

    }
    public static void main(String[] args) {
        int n=3,m=3;
        int array[][]=new int[n][m];
        
        Scanner sc=new Scanner(System.in);
      
       //Input of elements in array
       System.out.println("Enter the elements in the array:");
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            array[i][j]=sc.nextInt();
        }
       }

       
       // Output 
       System.out.println("The elements of array are:");
       for (int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(array[i][j]+" ");
        }
        System.out.println();

       }

       int search=small(array);
        System.out.println("The smallest number is:"+search);
        sc.close();
    }
}
