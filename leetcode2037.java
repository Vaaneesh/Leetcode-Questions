import java.util.Arrays;
import java.util.Scanner;

public class leetcode2037 {
    public static void main(String[] args) {
        Scanner ob=new Scanner (System.in);
        System.out.println("Enter size of arr1");
        int n=ob.nextInt();
        int arr1[]=new int[n];
        System.out.println("Enter ele");
        for(int i=0;i<n;i++){
            arr1[i]=ob.nextInt();
        }
        System.out.println("Enter size of arr2");
        int n2=ob.nextInt();
        int arr2[]=new int[n2];
        System.out.println("Enter ele");
        for(int i=0;i<n2;i++){
            arr2[i]=ob.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.abs(arr1[i]-arr2[i]);
        }
        System.out.println(sum);
        ob.close();
    }
}
