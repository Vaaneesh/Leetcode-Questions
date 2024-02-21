import java.util.Arrays;
import java.util.Scanner;

public class leetcode1362 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter no");
        int n=ob.nextInt();
        int arr[]=new int[2];
        for(int i=(int)Math.sqrt(n+2);i>=1;i--){
            if((n+1)%i==0){
                arr[0]=i;
                arr[1]=(n+1)/i;
            }
            if((n+2)%i==0){
                arr[0]=i;
                arr[1]=(n+2)/i;
            }
        }
        System.out.println(Arrays.toString(arr));
        ob.close();
    }
}
