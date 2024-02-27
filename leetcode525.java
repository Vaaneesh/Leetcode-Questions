import java.util.HashMap;
import java.util.Scanner;

public class leetcode525{
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter ele");
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0,max=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
            sum+=-1;
            else sum+=arr[i];
            if(map.containsKey(sum)){
                max=Math.max(sum,i-map.get(sum));
            }
            else map.put(sum,i);
        }
        System.out.println(max);
        ob.close();
    }
}