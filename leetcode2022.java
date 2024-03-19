import java.util.Arrays;
import java.util.Scanner;

public class leetcode2022 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int size=ob.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println("Enter size of 2D arr");
        int m=ob.nextInt();
        int n=ob.nextInt();
        ob.close();
        if(arr.length!=m*n){
            System.out.println("[]");
            return;
        }
        int arr2[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr2[i][j]=arr[i*n+j];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
