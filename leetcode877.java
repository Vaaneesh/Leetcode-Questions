import java.util.Scanner;

public class leetcode877 {
    public static boolean check(int []arr){
        int alice=0;
        int bob=0;
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]>arr[j]){
                alice+=arr[i];
                bob+=arr[j];
                i++;
                j--;
            }
            else{
                alice+=arr[j];
                bob+=arr[i];
                i++;
                j--;
            }
        }
        if(alice>bob)
        return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }

        System.out.println(check(arr));
        ob.close();
    }
}
