import java.util.Scanner;

public class leetcode553 {
    public static String Optimal(int nums[]){

        if(nums.length==1){
            return (nums[0]+"");
        }
        if(nums.length==2){
            StringBuilder sb=new StringBuilder();
            sb.append(nums[0]+"/"+nums[1]);
            return sb.toString();
        }
        StringBuilder sb=new StringBuilder();
        sb.append(nums[0]+"/(");
        for(int i=1;i<nums.length-1;i++){
            sb.append(nums[i]+"/");
        }
        sb.append(nums[nums.length-1]+")");
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println(Optimal(arr));
        ob.close();
    }
}
