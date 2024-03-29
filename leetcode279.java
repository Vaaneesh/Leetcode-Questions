import java.util.*;
public class leetcode279 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter n");
        int n=ob.nextInt();
        int dp[]=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i<=n;++i){
            int min=Integer.MAX_VALUE;
            int j=1;
            while(i-j*j>=0){
                min=Math.min(min,dp[i-j*j]+1);
                ++j;
            }
            dp[i]=min;
        }
        System.out.println(dp[n]);
        ob.close();
    }
}
