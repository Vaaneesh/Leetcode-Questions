import java.util.HashMap;
import java.util.Scanner;

public class leetcode217 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter ele");
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        ob.close();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                System.out.println("true");
                return;
            }
            map.put(arr[i],1);
        }
        System.out.println("false");
    }
}
