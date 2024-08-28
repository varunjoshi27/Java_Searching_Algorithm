import java.util.*;
public class smallest {
    public static int Smallestarr(int number[]){
        int small=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if (number[i]<small) {
                small=number[i];
            }
        }
        return small;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int number[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<number.length;i++){
            number[i]=sc.nextInt();
        }
        int Small=Smallestarr(number);
        System.out.println("The smallest number is:"+Small);
        sc.close();
    }

}
