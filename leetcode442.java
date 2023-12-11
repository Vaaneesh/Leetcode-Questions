import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class leetcode442 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        ob.close();
        Arrays.sort(arr);
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1])
            ans.add(arr[i]);
        }
        System.out.println(ans);
    }
}
