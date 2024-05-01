import java.util.ArrayList;
import java.util.Scanner;

public class leetcode1248 {
    public static int numofSubarrays(int []arr,int k){
        ArrayList<Integer>pos=new ArrayList<>();
        pos.add(0);
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1)
            pos.add(i+1);
        }
        pos.add(arr.length+1);
        int ans=0;
        for(int i=1;i<=pos.size()-k-1;i++){
            int start=pos.get(i)-pos.get(i-1);
            int end=pos.get(i+k)-pos.get(i+k-1);
            ans+=start*end;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println("Enter k");
        int k=ob.nextInt();
        System.out.println(numofSubarrays(arr,k));
        ob.close();
    }
}
