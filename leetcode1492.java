import java.util.ArrayList;
import java.util.Scanner;

public class leetcode1492 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter no and kth no. factor");
        int n=ob.nextInt();
        int k=ob.nextInt();
        ArrayList<Integer>factors=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0)
            factors.add(i);
        }
        System.out.println(factors.size()<k?-1:factors.get(k-1));
        ob.close();
    }
}
