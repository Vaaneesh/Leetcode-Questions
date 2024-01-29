import java.util.Scanner;

public class leetcode45 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter no");
        int n=ob.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=ob.nextInt();
        }
        int sc=0;
        int e=0,max=0;
        for(int i=0;i<nums.length-1;i++){
            max=Math.max(max,i+nums[i]);
            if(i==e){
                sc++;
                e=max;
            }
        }
        System.out.println(sc);
        ob.close();
    }
}
