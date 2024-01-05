import java.util.Scanner;

public class leetcode1980 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size of arr");
        int n=ob.nextInt();
        System.out.println("Enter elements");
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.next();
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++){
            ans.append(arr[i].charAt(i)=='0'?"1":"0");
        }
        System.out.println(ans.toString());
        ob.close();
    }
}
