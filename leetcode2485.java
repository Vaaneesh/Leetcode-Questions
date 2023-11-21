import java.util.Scanner;

public class leetcode2485 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a no");
        int n=ob.nextInt();
        ob.close();
        int sum=n*(n+1)/2;
        int temp=0;
        for(int i=0;i<n;i++){
            temp+=i;
            if(sum-temp+i==temp){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
