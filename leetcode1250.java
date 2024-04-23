import java.util.Scanner;

public class leetcode1250 {
    public static boolean isGoodArray(int nums[]){
        int n=nums[0];
        for(int i=1;i<nums.length;i++){
            n=gcd(n,nums[i]);
            if(n==1)
            return true;
        }
        return n==1;
    }
    public static int gcd(int a,int b){
        if(b==0)
        return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int size=ob.nextInt();
        System.out.println("Enter ele");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println(isGoodArray(arr));
        ob.close();
    }
}
