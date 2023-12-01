import java.util.Scanner;

public class leetcode1551 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter no");
        int n=ob.nextInt();
        int res=0;
        if(n%2==0)
        res=(n/2)*(n/2);
        else
        res=((n-1)/2)*((n+1)/2);
        System.out.println(res);
        ob.close();
    }
}
