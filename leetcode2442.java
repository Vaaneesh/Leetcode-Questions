import java.util.HashSet;
import java.util.Scanner;

public class leetcode2442{
    public static int reverse(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+(n%10);
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n;
        System.out.println("Enter size of arr and its ele");
        n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        HashSet<Integer>set=new HashSet<>();
        for(int i:arr){
            set.add(i);
            set.add(reverse(i));
        }
        System.out.println(set.size());
        ob.close();
    }
}