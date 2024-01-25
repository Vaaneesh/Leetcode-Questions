import java.util.Scanner;

public class leetcode2680 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter ele");
        for(int i=0;i<n;i++){
            nums[i]=ob.nextInt();
        }
        System.out.println("Enter k");
        int k=ob.nextInt();
        long base=0,backup=0,best=0;
        for(int num:nums){
            backup|=base&num;
            base|=num;
        }
        for(int num:nums)
        best=Math.max(best,base-num| backup |(long)num<<k);
        System.out.println(best);
        ob.close();
    }
}
