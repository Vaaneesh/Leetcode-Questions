import java.util.Arrays;
import java.util.Scanner;

public class leetcode1561 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n;
        System.out.println("Enter size of arr and its elements");
        n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        int sum=0;
        Arrays.sort(arr);
        for(int i=n/3;i<n;i=i+2){
            sum+=arr[i];
        }
        System.out.println(sum);
        ob.close();
    }
}
