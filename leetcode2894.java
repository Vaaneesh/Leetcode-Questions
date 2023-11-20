import java.util.Scanner;

public class leetcode2894 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter value of n and m");
        int n=ob.nextInt();
        int m=ob.nextInt();
        ob.close();
        int ans=0;
        for(int i=1;i<=n;i++){
            if(i%m==0)
            ans-=i;
            else
            ans+=i;
        }
        System.out.println(ans);
    }
}
