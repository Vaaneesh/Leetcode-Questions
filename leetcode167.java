import java.util.Arrays;
import java.util.Scanner;

public class leetcode167 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size of arr");
        int n=ob.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            nums[i]=ob.nextInt();
        }
        System.out.println("Enter target");
        int target=ob.nextInt();
        ob.close();
        int arr[]=new int[2];
        int l=0;
        int u=n-1;
        while(l<u){
            if(nums[l]+nums[u]==target){
                arr[0]=l+1;
                arr[1]=u+1;
                break;
            }
            if(nums[l]+nums[u]>target)
            u--;
            else
            l++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
