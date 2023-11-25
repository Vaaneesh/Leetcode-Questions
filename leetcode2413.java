import java.util.Scanner;

public class leetcode2413 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter no.");
        int n=ob.nextInt();
        ob.close();
        if(n%2!=0){
            System.out.println(n*2);
            return;
        }
        else
        System.out.println(n);
    }
}
