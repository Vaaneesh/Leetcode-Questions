import java.util.Scanner;

public class leetcode198 {
    public static int houseRobber(int arr[]){
        int rob=0;
        int notrob=0;
        for(int i=0;i<arr.length;i++){
            int curr=notrob+arr[i];
            notrob=Math.max(notrob,rob);
            rob=curr;
        }
        return Math.max(notrob,rob);
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        System.out.println("Enter ele");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println(houseRobber(arr));
        ob.close();
    }
}
