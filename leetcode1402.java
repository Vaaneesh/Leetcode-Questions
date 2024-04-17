import java.util.*;

public class leetcode1402 {
    public static int reducingDishes(int arr[]){
        int sum=0,res=0;
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=n-1;i>=0;i--){
            sum+=arr[i];
            if(sum<0) break;
            res+=sum;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        System.out.println("Enter elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println(reducingDishes(arr));
        ob.close();
    }
}
