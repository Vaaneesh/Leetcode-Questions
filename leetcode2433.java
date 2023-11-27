import java.util.Arrays;
import java.util.Scanner;

public class leetcode2433 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=ob.nextInt();
        System.out.println("Enter ele");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        ob.close();
        int ans[]=new int[n];
        ans[0]=arr[0];
        for(int i=1;i<n;i++){
            ans[i]=arr[i]^arr[i-1];
        }
        System.out.println(Arrays.toString(ans));
    }
}
