import java.util.HashSet;
import java.util.Scanner;

public class leetcode2206 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        System.out.println("Enter elements of arr");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        HashSet<Integer>set=new HashSet<>();
        for(int i:arr){
            if(!set.add(i))
            set.remove(i);
        }
        System.out.println(set.isEmpty());
        ob.close();
    }
}
