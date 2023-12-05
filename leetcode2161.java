import java.util.Arrays;
import java.util.Scanner;

public class leetcode2161 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n;
        System.out.println("Enter size of array");
        n=ob.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            nums[i]=ob.nextInt();
        }
        System.out.println("Enter pivot");
        int pivot=ob.nextInt();
        ob.close();
        int arr[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                arr[count]=nums[i];
                count++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                arr[count]=nums[i];
                count++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                arr[count]=nums[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
