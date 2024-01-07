import java.util.Scanner;

public class leetcode852 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        int start=0,end=n-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1])
            start=mid+1;
            else end=mid;
        }
        System.out.println(start);
        ob.close();
    }
}
