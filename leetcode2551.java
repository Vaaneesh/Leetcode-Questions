import java.util.Arrays;
import java.util.Scanner;

public class leetcode2551 {
    public static long putMarbles(int arr[],int k){
        int n=arr.length;
        int pairs[]=new int[n-1];
        for(int i=1;i<n;i++){
            pairs[i-1]=arr[i]+arr[i-1];
        }
        Arrays.sort(pairs);
        long min=0,max=0;
        for(int i=0;i<k-1;i++){
            min+=pairs[i];
            max+=pairs[n-i-2];
        }
        return max-min;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println("Enter k");
        int k=ob.nextInt();
        System.out.println(putMarbles(arr, k));
        ob.close();
    }
}
