import java.util.Arrays;
import java.util.Scanner;

public class leetcode945 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter ele");
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        Arrays.sort(arr);
        int ans=0;
        for(int i=1;i<n;i++){
            if(arr[i]<=arr[i-1]){
                ans+=arr[i-1]-arr[i]+1;
                arr[i]=arr[i-1]+1;
            }
        }
        System.out.println(ans);
        ob.close();
    }
}
