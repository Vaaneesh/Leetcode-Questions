import java.util.Scanner;

public class leetcode1780 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n;
        System.out.println("Enter no");
        n=ob.nextInt();
        ob.close();
        while(n>0){
            if(n%3==2){
                System.out.println(false);
                return;
            }
            else n/=3;
        }
        System.out.println(true);
    }
}