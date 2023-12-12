import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class leetcode2657 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size of both arrays");
        int n=ob.nextInt();
        System.out.println("Enter ele of 1st arr");
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=ob.nextInt();
        }
        System.out.println("Enter ele of 2nd arr");
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=ob.nextInt();
        }
        int ans[]=new int[n];
        int ind=0;
        for(int i=0;i<n;i++){
            int count=0;
            HashSet<Integer>set=new HashSet<>();
            for(int j=0;j<=i;j++){
                set.add(arr1[j]);
            }
            for(int k=0;k<=i;k++){
                if(!set.add(arr2[k]))
                count++;
            }
            ans[ind++]=count;
        }
        System.out.println(Arrays.toString(ans));
        ob.close();

    }
}
