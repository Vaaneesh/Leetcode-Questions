import java.util.Scanner;

public class leetcode2428 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter rows and cols");
        int n=ob.nextInt();
        int m=ob.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=ob.nextInt();
            }
        }
        int max=0;
        for(int i=0;i<n-2;i++){
            for(int j=0;j<m-2;j++){
                int sum=0;
                for(int z=j;z<j+3;z++){
                    sum+=arr[i][z];
                }
                sum+=arr[i+1][j+1];
                for(int z=j;z<j+3;z++){
                    sum+=arr[i+2][z];
                }
                max=Math.max(max,sum);
            }
        }
        System.out.println(max);
        ob.close();
    }
}
