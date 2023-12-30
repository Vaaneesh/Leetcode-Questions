import java.util.Arrays;
import java.util.Scanner;

public class leetcode950 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        int ans[]=new int[n];
        Arrays.sort(arr);
        ans[0]=arr[0];
        int k=1,c=0;
        while(k<n){
            for(int i=1;i<n;i++){
                if(ans[i]==0){
                    c++;
                    if(c==2){
                        ans[i]=arr[k++];
                        c=0;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(ans));
        ob.close();
    }
}
