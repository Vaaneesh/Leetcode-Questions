import java.util.Scanner;

public class leetcode96 {
    public static int numTree(int n){
        if(n==0 || n==1)
        return 1;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=numTree(i-1)*numTree(n-i);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter no");
        int n=ob.nextInt();
        System.out.println(numTree(n));
        ob.close();
    }
}
