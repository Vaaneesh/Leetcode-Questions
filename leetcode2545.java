import java.util.Arrays;
import java.util.Scanner;

public class leetcode2545{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter length of 2d");
        int n=ob.nextInt();
        int m=ob.nextInt();
        System.out.println("enter elements");
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=ob.nextInt();
            }
        }
        System.out.println("Enter key");
        int k=ob.nextInt();
        ob.close();
        int ans[][]=new int[n][m];
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j][k]<arr[j+1][k]){
                    ans[temp]=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=ans[temp];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}