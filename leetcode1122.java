import java.util.Arrays;
import java.util.Scanner;

public class leetcode1122 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size of arr1");
        int n=ob.nextInt();
        int arr1[]=new int[n];
        System.out.println("Enter ele");
        for(int i=0;i<n;i++){
            arr1[i]=ob.nextInt();
        }
        System.out.println("Enter size of arr2");
        int m=ob.nextInt();
        int arr2[]=new int[m];
        System.out.println("Enter ele");
        for(int i=0;i<m;i++){
            arr2[i]=ob.nextInt();
        }
        int len=0;
        for(int i=0;i<n;i++){
            len=Math.max(len,arr1[i]);
        }
        int []count=new int[len+1];
        for(int i=0;i<n;i++){
            count[arr1[i]]++;
        }
        int ans[]=new int[n];
        int ind=0;
        for(int i=0;i<arr2.length;i++){
            while(count[arr2[i]]>0){
                ans[ind]=arr2[i];
                ind++;
                count[arr2[i]]--;
            }
        }
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                ans[ind]=i;
                ind++;
                count[i]--;
            }
        }
        System.out.println(Arrays.toString(ans));
        ob.close();
    }
}
