import java.util.Scanner;

public class leetcode540 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        ob.close();
        int left=0,right=n-1;
        while(left<right){
            int mid=(left+right)/2;
            if(mid%2==1){
                mid--;
            }
            if(arr[mid]!=arr[mid+1])
            right=mid;
            else 
            left=mid+2;
        }
        System.out.println(arr[left]);
    }
}
