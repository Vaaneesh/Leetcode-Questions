import java.util.Scanner;

public class leetcode1295 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        System.out.println("Enter ele");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            String curr=Integer.toString(arr[i]);
            if(curr.length()%2==0)c++;
        }
        System.out.println("No of letters with even digits=> "+c);
        ob.close();
    }
}
