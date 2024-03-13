import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class leetcode1207 {
     public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashSet<Integer>set=new HashSet<>();
        for(int i:map.values()){
            set.add(i);
        }
        return set.size()==map.size();
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println(uniqueOccurrences(arr));
        ob.close();
    }
}
