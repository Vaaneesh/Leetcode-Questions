import java.util.HashSet;
import java.util.Scanner;

public class leetcode961{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size and ele");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        ob.close();
        HashSet<Integer>set=new HashSet<>();
        for(int i:arr){
            if(set.contains(i)){
                System.out.println(i);
                return;
            }
            else
            set.add(i);
        }
    }
}