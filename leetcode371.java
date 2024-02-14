import java.util.Scanner;

public class leetcode371 {
    public static int getSum(int a,int b){
        int c;
        while(b!=0){
            c=a&b;
            a=a^b;
            b=c<<1;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter two no.s");
        int a=ob.nextInt();
        int b=ob.nextInt();
        System.out.println(getSum(a, b));
        ob.close();
    }
}
