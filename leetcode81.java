import java.util.*;
public class leetcode81{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size of array and its elements");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        ob.close();
        System.out.println("Enter target");
        int target=ob.nextInt();
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                System.out.println("true");
                return;
            }
            else if(target<arr[mid])
            end=mid-1;
            else
            start=mid+1;
        }
        System.out.println("false");
    }
}