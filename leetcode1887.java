import java.util.*;
public class leetcode1887 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size of arr");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        Arrays.sort(arr);
        int c=0,ans=0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1])
            c++;
            ans+=c;
        }
        System.out.println(ans);
        ob.close();
    }
}
