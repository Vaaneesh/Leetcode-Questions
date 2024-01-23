import java.util.Scanner;

public class leetcode494 {
    public static int check(int[] nums,int index,int sum,int target){
        if(nums.length==index){
            if(sum==target)
            return 1;
            else
            return 0;
        }
        int left=check(nums,index+1,sum+nums[index],target);
        int right=check(nums,index+1,sum-nums[index],target);
        return right+left;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        System.out.println("Enter elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println("Enter target");
        int target=ob.nextInt();
        ob.close();
        System.out.println(check(arr,0,0,target));
    }
}
