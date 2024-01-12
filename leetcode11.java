import java.util.*;
public class leetcode11{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size ");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        int left=0;
        int right=n-1;
        int max=0;
        while(left<right){
            int w=right-left;
            int h=Math.min(arr[left],arr[right]);
            int area=w*h;
            max=Math.max(area,max);
            if(arr[left]>arr[right]) right--;
            else if(arr[left]<arr[right])left++;
            else{
                left++;
                right--;
            }
        }
        System.out.println(max);
        ob.close();
    }
}