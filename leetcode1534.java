import java.util.Scanner;

public class leetcode1534 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter size");
        int n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter ele");
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println("Enter value of A, B, C");
        int a=ob.nextInt();
        int b=ob.nextInt();
        int c=ob.nextInt();
        int ans=0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(Math.abs(arr[i]-arr[j])<=a && Math.abs(arr[k]-arr[j])<=b && Math.abs(arr[i]-arr[k])<=c){
                        ans++;
                    } 
                }
            }
        }
        System.out.println(ans);
        ob.close();
    }
}
