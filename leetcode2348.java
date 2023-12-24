import java.util.Scanner;

public class leetcode2348 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        System.out.println("Enter elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        int sum=0,len=0;
        long count=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum!=0){
                sum=0;
                len=0;
                continue;
            }
            len++;
            count+=len;
        }
        System.out.println(count);
        ob.close();
    }
}
