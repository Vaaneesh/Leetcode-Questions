import java.util.Arrays;
import java.util.Scanner;

public class leetcode378 {
    public static int kthSmallest(int matrix[][],int k){
        int n=matrix.length;
        int arr[]=new int[n*n];
        int indx=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[indx++]=matrix[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        System.out.println();
        int matrix[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=ob.nextInt();
            }
        }
        System.out.println("Enter kth smallest to find");
        int k=ob.nextInt();
        System.out.println(kthSmallest(matrix,k));
        ob.close();
    }
}
