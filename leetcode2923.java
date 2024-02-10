import java.util.Scanner;

public class leetcode2923 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size and arr");
        int n=ob.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=ob.nextInt();
            }
        }
        int winner=0;
        for(int i=0;i<n;i++){
            if(i==winner)
            continue;
            if(arr[winner][i]==0)
            winner=i;
        }
        System.out.println(winner);
        ob.close();
    }
}
