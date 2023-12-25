import java.util.Scanner;

public class leetcode48 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size of 2d arr");
        int n=ob.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=ob.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            int a=0;
            int b=n-1;
            while(a<=b){
                int temp=arr[a][i];
                arr[a][i]=arr[b][i];
                arr[b][i]=temp;
                a++;
                b--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        ob.close();
    }
}
