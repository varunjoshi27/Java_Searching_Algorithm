import java.util.*;
public class largest {
    public static int largestarr(int number[]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if (number[i]>large) {
                large=number[i];
                
            }
        }
        return large;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int number[]=new int[n];

        System.out.println("Enter the elements of the array");
        for(int i=0;i<number.length;i++){
            number[i]=sc.nextInt();
        }
         int lar=largestarr(number);
        System.out.println("The largest element in the array is :"+lar);
        sc.close();
    }
}
