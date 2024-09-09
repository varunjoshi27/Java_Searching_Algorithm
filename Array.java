import java.util.*;
public class Array {

    public static void main(String[] args) {
        int n=3,m=3;

        int array[][]=new int[n][m];
       Scanner sc=new Scanner(System.in);
        // user input in the program
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                array[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        

        sc.close();
    }
}