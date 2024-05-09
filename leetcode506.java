import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class leetcode506 {
    public static String[] relativeRanks(int arr[]){
        int temp[]=new int[arr.length];
        int l=arr.length;
        for(int i=0;i<l;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp);
        Map<Integer,String>map=new HashMap<>();
        for(int i=l-1;i>=0;i--){
            if(i==l-1) map.put(temp[i],"Gold Medal");
            if(i==l-2) map.put(temp[i],"Silver Medal");
            if(i==l-3) map.put(temp[i],"Bronze Medal");
            else map.put(temp[i],String.valueOf(l-i));
        }
        String ans[]=new String[l];
        for(int i=0;i<l;i++){
            ans[i]=map.get(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println(Arrays.toString(relativeRanks(arr)));
        ob.close();
    }
}
