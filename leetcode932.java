import java.util.Arrays;
import java.util.Scanner;

public class leetcode932 {
    public static int[] beautifulArray(int n){
        int arr[]=new int[n];
        if(n==1){
            arr[0]=1;
            return arr;
        }
        int left[]=beautifulArray((n+1)/2);
        int right[]=beautifulArray(n/2);
        for(int i=left.length;i<n;i++){
            arr[i]=right[i-left.length]*2; //even
        }
        for(int i=0;i<left.length;i++){
            arr[i]=left[i]*2-1;//odd
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter n");
        int n=ob.nextInt();
        System.out.println(Arrays.toString(beautifulArray(n)));
        ob.close();
    }
}
