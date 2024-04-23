import java.util.Scanner;

public class leetcode213 {
    private static int rob(int[] nums,int lo,int hi){
        int inc=0,exc=0;
        for(int j=lo;j<=hi;j++){
            int i=inc,e=exc;
            inc=e+nums[j];
            exc=Math.max(e,i);
        }
        return Math.max(inc,exc);
    }
    public static int rob(int nums[]){
        if(nums.length==1)
        return nums[0];
        return Math.max(rob(nums,0,nums.length-2),rob(nums,1,nums.length-1));
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size and ele");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println(rob(arr));
        ob.close();
    }
}
