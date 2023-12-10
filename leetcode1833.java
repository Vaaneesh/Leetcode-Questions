import java.util.Scanner;

public class leetcode1833 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println("enter coins");
        int coins=ob.nextInt();
        ob.close();
        for(int i=0;i<n;i++){
            if((coins-=arr[i])<0){
                System.out.println(i);
                return;
            }
        }
        System.out.println(n);
    }
}
