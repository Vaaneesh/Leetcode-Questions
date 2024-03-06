import java.util.Scanner;

public class leetcode881 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println("Enter limit");
        int limit=ob.nextInt();
        int count=0,left=0,right=n-1;
        while(left<=right){
            int sum=arr[left]+arr[right];
            if(sum<=limit){
                count++;
                left++;
                right--;
            }
            else{
                count++;
                right--;
            }
        }
        System.out.println(count);
        ob.close();
    }
}
