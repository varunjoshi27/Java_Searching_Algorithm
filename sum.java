import java.util.*;
public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want the sum");
        int n=sc.nextInt();

        int sum=0;
        for(int i=1;i<n;i++){
            sum=sum+i;
        }
        System.out.println("The sum of the given numbers is:"+sum);
        sc.close();
    }
}
