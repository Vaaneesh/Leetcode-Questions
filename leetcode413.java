import java.util.Scanner;

public class leetcode413 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        int c=0,sum=0;
        for(int i=2;i<n;i++){
            if(arr[i]-arr[i-1]==arr[i-1]-arr[i-2]){
                c++;
                sum+=c;
            }
            else c=0;
        }
        System.out.println(sum);
        ob.close();
    }
}
