import java.util.Scanner;

public class leetcode2444 {
    public static long countSubarrays(int arr[],int min,int max){
        long res=0;
        int badidx=-1,leftidx=-1,rightidx=-1;
        for(int i=0;i<arr.length;i++){
            if(!(min<=arr[i] && max>=arr[i]))
            badidx=i;
            if(max==arr[i])
            rightidx=i;
            if(min==arr[i])
            leftidx=i;
            res+=Math.max(0,Math.min(leftidx,rightidx)-badidx);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter ele");
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println("Enter min and max");
        int min=ob.nextInt();
        int max=ob.nextInt();
        System.out.println(countSubarrays(arr, min, max));
        ob.close();
    }
}
