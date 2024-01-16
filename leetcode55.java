import java.util.Scanner;

public class leetcode55 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size of arr");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        ob.close();
        int reachable=0;
        for(int i=0;i<n;i++){
            if(i>reachable){
                System.out.println(false);
                return;
            }
            reachable=Math.max(reachable,i+arr[i]);
        }
        System.out.println(true);
    }
}
