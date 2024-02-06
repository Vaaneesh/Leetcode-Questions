import java.util.HashMap;
import java.util.Scanner;

public class leetcode1726 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size and ele");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        ob.close();
        if(n<4){
            System.out.println(0);
            return;
        }
        int ans=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int val=arr[i]*arr[j];
                map.put(val,map.getOrDefault(val,0)+1);
            }
        }
        for(int key:map.keySet()){
            int val=map.get(key);
            if(val>1){
                ans+=val*(val-1)*4;
            }
        }
        System.out.println(ans);
    }
}
