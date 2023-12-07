import java.util.Scanner;

public class leetcode2149 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        ob.close();
        int ans[]=new int[n];
        int pos[]=new int[n/2];
        int neg[]=new int[n/2];
        int c,d;
        c=d=0;
        for(int num:arr){
            if(num>0)
            pos[c++]=num;
            else
            neg[d++]=num;
        }
        int k=0;
        for(int i=0;i<n;i+=2){
            ans[i]=pos[k];
            ans[i+1]=neg[k];
            k++;
        }
        System.out.println(ans);
    }
}
