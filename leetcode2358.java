import java.util.Scanner;

public class leetcode2358 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        System.out.println("Enter elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println((int)(Math.sqrt(n*8+1)-1)/2);
        ob.close();
    }
}
