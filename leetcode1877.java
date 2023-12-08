import java.util.Scanner;

public class leetcode1877 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        System.out.println("Enter elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        ob.close();
        int left,right;
        left=0;
        right=n-1;
        int maxSum=Integer.MIN_VALUE;
        while(left<right){
            int curr=arr[left]+arr[right];
            maxSum=Math.max(curr,maxSum);
            left++;
            right--;
        }
        System.out.println(maxSum);
    }
}
