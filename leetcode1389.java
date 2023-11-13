import java.util.ArrayList;
import java.util.Scanner;

public class leetcode1389 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=ob.nextInt();
        int index[]=new int[n];
        int val[]=new int[n];
        for(int i=0;i<n;i++){
            val[i]=ob.nextInt();
        }
        for(int i=0;i<n;i++){
            index[i]=ob.nextInt();
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(index[i],val[i]);
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        System.out.println(arr);
        ob.close();
    }
}
