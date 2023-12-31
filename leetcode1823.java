import java.util.Scanner;

public class leetcode1823 {
    public static int findTheWinner(int n, int k) {
        int ans=solve(n,k);
        return ans+1;
    }
    public static int solve(int n,int k){
        if(n==1)
        return 0;
        return(solve(n-1,k)+k)%n;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter n and k");
        int n=ob.nextInt();
        int k=ob.nextInt();
        System.out.println(findTheWinner(n,k));
        ob.close();
    }
}
