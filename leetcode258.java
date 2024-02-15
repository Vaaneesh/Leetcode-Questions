import java.util.Scanner;

public class leetcode258 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter no");
        int n=ob.nextInt();
        ob.close();
        if(n==0){
            System.out.println(0);
            return;
        }
        else if(n%9==0){
            System.out.println(9);
            return;
        }
        else{
            System.out.println(n%9);
        }
    }
}
